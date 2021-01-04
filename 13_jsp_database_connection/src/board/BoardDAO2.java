package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.servlet.jsp.tagext.TryCatchFinally;

public class BoardDAO2 {

	private BoardDAO2() {}
	private static BoardDAO2 instance = new BoardDAO2();
	public static BoardDAO2 getInstance() {
		return instance;
	}

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public Connection getConnection() {
		String jdbcUrl = "jdbc:mysql://localhost:3306/BOARD_EX1?serverTimezone=UTC";
		String dbId = "root";
		String dbPass = "1234";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPass);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public Vector<BoardDTO2> getAllBoard() {
		Vector<BoardDTO2> vec = new Vector<BoardDTO2>();
		BoardDTO2 model = null;
		try {
			conn = getConnection();
			String sql = "select * from board";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				model = new BoardDTO2();
				model.setNum(rs.getInt(1));
				model.setWriter(rs.getString(2));
				model.setEmail(rs.getString(3));
				model.setSubject(rs.getString(4));
				model.setPassword(rs.getString(5));
				model.setRegDate(rs.getDate(6).toString());
				model.setReadCount(rs.getInt(7));
				model.setContent(rs.getString(8));
				vec.add(model);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {try {rs.close();} catch (SQLException e) {}}
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null) {try {conn.close();} catch (SQLException e) {}}
		}
		return vec;
	}

	public BoardDTO2 getOneBoard(int num) {
		BoardDTO2 model = new BoardDTO2();
		try {
			conn = getConnection();
			String sql = "update board set read_count=read_count+1 where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();

			sql = "select * from board where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				model.setNum(rs.getInt(1));
				model.setWriter(rs.getString(2));
				model.setEmail(rs.getString(3));
				model.setSubject(rs.getString(4));
				model.setPassword(rs.getString(5));
				model.setRegDate(rs.getDate(6).toString());
				model.setReadCount(rs.getInt(7));
				model.setContent(rs.getString(8));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {try {rs.close();} catch (SQLException e) {}}
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null) {try {conn.close();} catch (SQLException e) {}}
		}
		return model;
	}

	public BoardDTO2 getOneUpdateBoard(int num) {
		BoardDTO2 model = new BoardDTO2();
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM BOARD WHERE NUM=?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				model.setNum(rs.getInt(1));
				model.setWriter(rs.getString(2));
				model.setEmail(rs.getString(3));
				model.setSubject(rs.getString(4));
				model.setPassword(rs.getString(5));
				model.setRegDate(rs.getDate(6).toString());
				model.setReadCount(rs.getInt(7));
				model.setContent(rs.getString(8));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {try {rs.close();} catch (SQLException e) {}}
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null) {try {conn.close();} catch (SQLException e) {}}
		}
		return model;

	}

	public boolean validMemberCheck(BoardDTO2 bdto) {
		boolean isValid = false;
		try {
			conn = getConnection();
			String sql = "select * from board where num=? and password=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bdto.getNum());
			pstmt.setString(2, bdto.getPassword());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				isValid = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {try {rs.close();} catch (SQLException e) {}}
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null) {try {conn.close();} catch (SQLException e) {}}
		}
		return isValid;

	}

	public void insertBoard(BoardDTO2 bdto) {
		try {
			conn = getConnection();
			String sql = "insert into board(writer,email,subject,password,reg_Date,read_Count,content)";
			sql += "values(?,?,?,?,now(),0,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bdto.getWriter());
			pstmt.setString(2, bdto.getEmail());
			pstmt.setString(3, bdto.getSubject());
			pstmt.setString(4, bdto.getPassword());
			pstmt.setString(5, bdto.getContent());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null) {try {conn.close();} catch (SQLException e) {}}
		}
	}

	public boolean updateBoard(BoardDTO2 bdto) {
		boolean isUpdate = false;
		try {
			if (validMemberCheck(bdto)) {
				conn = getConnection();
				String sql = "update board set subject=?, content=? where num=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, bdto.getSubject());
				pstmt.setString(2, bdto.getContent());
				pstmt.setInt(3, bdto.getNum());
				pstmt.executeUpdate();
				isUpdate = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null) {try {conn.close();} catch (SQLException e) {}}
		}
		return isUpdate;

	}

	public boolean deleteBoard(BoardDTO2 bdto) {
		boolean isDelete = false;
		try {
			if (validMemberCheck(bdto)) {
				conn = getConnection();
				String sql = "delete from board where num=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, bdto.getNum());
				pstmt.executeUpdate();
				isDelete = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null) {try {conn.close();} catch (SQLException e) {}}
		}
		return isDelete;
	}

	public Vector<BoardDTO2> getSearch(String all, String text) {
		Vector<BoardDTO2> vec = new Vector<>();
		BoardDTO2 model = null;
		try {
			if (all.equals("allsearch")) {
				conn = getConnection();
				String sql = "select * from board where writer or subject like '%" + text + "%";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					model = new BoardDTO2();
					model.setNum(rs.getInt(1));
					model.setWriter(rs.getString(2));
					model.setEmail(rs.getString(3));
					model.setSubject(rs.getString(4));
					model.setPassword(rs.getString(5));
					model.setRegDate(rs.getDate(6).toString());
					model.setReadCount(rs.getInt(7));
					model.setContent(rs.getString(8));
					vec.add(model);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {try {rs.close();} catch (SQLException e) {}}
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null) {try {conn.close();} catch (SQLException e) {}}
		}
		return vec;

	}

}
