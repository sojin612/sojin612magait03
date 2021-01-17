package loginDaoPractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import loginDtoPractice.MemberDTO2;

public class MemberDAO2 {

	private MemberDAO2() {}
	private static MemberDAO2 instance= new MemberDAO2();
	public static MemberDAO2 getInstance() {
		return instance;
	}
	
	Connection conn 		= null;
    PreparedStatement pstmt = null;
    ResultSet rs 			= null;
    
    public Connection getConnection() throws Exception {
        
        Context initCtx = new InitialContext();
        // lookup 메서드를 통해
        // server.xml 파일에 접근하여 자바환경 코드를 검색
        Context envCtx = (Context)initCtx.lookup("java:comp/env");
        // <Context>태그안의 <Resource> 환경설정의
        // name이 jdbc/pool인 것을 검색
        DataSource ds = (DataSource)envCtx.lookup("jdbc/pool");
        conn = ds.getConnection();
        
        return conn;
        
    }
    
	public boolean joinMember(MemberDTO2 mdto) {
		boolean isJoin =false;
		
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement("select * from member where id=?");
			pstmt.setString(1, mdto.getId());
			rs=pstmt.executeQuery();
			if(!rs.next()) {
				pstmt=conn.prepareStatement("insert into member(id,pw,name,tel,email) values(?,?,?,?,?)");
				pstmt.setString(1, mdto.getId());
				pstmt.setString(2, mdto.getPw());
				pstmt.setString(3, mdto.getName());
				pstmt.setString(4, mdto.getTel());
				pstmt.setString(5, mdto.getEmail());
				pstmt.executeUpdate();
				isJoin= true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(rs!=null) {try {rs.close();}catch(Exception e) {e.printStackTrace();}}
			if(pstmt!=null) {try {pstmt.close();}catch(Exception e) {e.printStackTrace();}}
			if(conn!=null) {try {conn.close();}catch(Exception e) {e.printStackTrace();}}
		}
		return isJoin;
	}
	
	
	public boolean login(String id, String pw) {
		boolean isLogin = false;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement("select * from member where id=? and pw=?");
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				isLogin=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(rs!=null) {try {rs.close();}catch(Exception e) {e.printStackTrace();}}
			if(pstmt!=null) {try {pstmt.close();}catch(Exception e) {e.printStackTrace();}}
			if(conn!=null) {try {conn.close();}catch(Exception e) {e.printStackTrace();}}
		}
		return isLogin;
	}
	
	public MemberDTO2 info(String id) {
		MemberDTO2 mdto= null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement("select * from member where id=?");
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				mdto=new MemberDTO2();
				mdto.setId(rs.getString("id"));
				mdto.setPw(rs.getString("pw"));
				mdto.setName(rs.getString("Name"));
				mdto.setTel(rs.getString("tel"));
				mdto.setEmail(rs.getString("email"));
				mdto.setField(rs.getString("field"));
				mdto.setSkill(rs.getString("skill"));
				mdto.setMajor(rs.getString("major"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(rs!=null) {try {rs.close();}catch(Exception e) {e.printStackTrace();}}
			if(pstmt!=null) {try {pstmt.close();}catch(Exception e) {e.printStackTrace();}}
			if(conn!=null) {try {conn.close();}catch(Exception e) {e.printStackTrace();}}
		}
		return mdto;
	}
	
	public void apply(String id, String field, String skill, String major) {
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement("update member set field=?, skill=?, major=? where id=?");
			pstmt.setString(1, field);
			pstmt.setString(2, skill);
			pstmt.setString(3, major);
			pstmt.setString(4, id);
			pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt!=null) {try {pstmt.close();}catch(Exception e) {e.printStackTrace();}}
			if(conn!=null) {try {conn.close();}catch(Exception e) {e.printStackTrace();}}
		}
	}
	
	public void delete(String id) {
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement("delete from member where id=?");
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt!=null) {try {pstmt.close();}catch(Exception e) {e.printStackTrace();}}
			if(conn!=null) {try {conn.close();}catch(Exception e) {e.printStackTrace();}}
		}
	}
	
	public void update(String id, MemberDTO2 mdto) {
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement("update member set pw=?,name=?,tel=?,email=?,field=?,skill=?,major=? where id=?");
			pstmt.setString(1, mdto.getPw());
			pstmt.setString(2, mdto.getName());
			pstmt.setString(3, mdto.getTel());
			pstmt.setString(4, mdto.getEmail());
			pstmt.setString(5, mdto.getField());
			pstmt.setString(6, mdto.getSkill());
			pstmt.setString(7, mdto.getMajor());
			pstmt.setString(8, id);
			pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt!=null) {try {pstmt.close();}catch(Exception e) {e.printStackTrace();}}
			if(conn!=null) {try {conn.close();}catch(Exception e) {e.printStackTrace();}}
		}
	}
	
	
}
