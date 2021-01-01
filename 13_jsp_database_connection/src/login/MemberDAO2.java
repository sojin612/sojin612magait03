package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO2 {

	private MemberDAO2() {
	}

	private static MemberDAO2 instance = new MemberDAO2();

	public static MemberDAO2 getInstance() {
		return instance;
	}

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public Connection getConnection() {

		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/login_ex?serverTimezone=UTC";
			String dbId = "root";
			String dbPass = "1234";

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPass);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

	public boolean insertMember(MemberDTO2 mdto) {
		boolean isFirstMember = false;
		try {
			if (!memberCheck(mdto.getId(), mdto.getPasswd())) {
				conn = getConnection();
				String sql = "INSERT INTO MEMBER VALUES(?,?,?,NOW())";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, mdto.getId());
				pstmt.setString(2, mdto.getPasswd());
				pstmt.setString(3, mdto.getName());
				pstmt.executeUpdate();
				isFirstMember = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}

		return isFirstMember;
	}

	public boolean updateMember(MemberDTO2 mdto) {
		boolean isUpdate = false;
		try {
			if (memberCheck(mdto.getId(), mdto.getPasswd())) {
				conn = getConnection();
				String sql = "UPDATE MEMBER SET NAME=? WHERE ID=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, mdto.getName());
				pstmt.setString(2, mdto.getId());
				pstmt.executeUpdate();
				isUpdate = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		return isUpdate;
	}

	public boolean deleteMember(String id, String passwd) {
		boolean isDelete = false;
		try {
			if (memberCheck(id, passwd)) {
				conn = getConnection();
				String sql = "DELETE FROM MEMBER WHERE ID=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				pstmt.executeUpdate();
				isDelete = true;

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}

		return isDelete;
	}

	public boolean memberCheck(String id, String passwd) {
		boolean isMember = false;

		try {
			conn = getConnection();
			String sql = "SELECT * FROM MEMBER WHERE ID=? AND PASSWD=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				isMember = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}

		return isMember;
	}

}
