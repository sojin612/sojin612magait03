package boardDAO2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import boardDTO2.BoardDTO2;

public class BoardDAO2 {
	
	private BoardDAO2() {}
	private static BoardDAO2 instance= new BoardDAO2();
	public static BoardDAO2 getInstance() {
		return instance;
	}
	
	Connection conn = null;
	PreparedStatement pstmt=null;
	ResultSet rs = null;
	
	public Connection getConnection() {
		
		try {
			Context initctx = new InitialContext();
			Context envctx = (Context) initctx.lookup("java:comp/env");
			DataSource ds = (DataSource) envctx.lookup("jdbc/pool");
			conn = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	
	public Vector<BoardDTO2> getAllBoard(){
		Vector<BoardDTO2> boardList =new Vector<>();
		BoardDTO2 model = null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement("select * from board");
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				model=new BoardDTO2();
				model.setNum(rs.getInt(1));
				model.setWriter(rs.getString(2));
				model.setEmail(rs.getString(3));
				model.setSubject(rs.getString(4));
				model.setPassword(rs.getString(5));
				model.setRegDate(rs.getDate(6).toString());
				model.setReadCount(rs.getInt(7));
				model.setContent(rs.getString(8));
				
				boardList.add(model);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)    {try {rs.close();}    catch (SQLException e) {}}
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null)  {try {conn.close();}  catch (SQLException e) {}}
		}
		
		return boardList;
	}
	
	public void insertBoard(BoardDTO2 bdto) {
		
		try {
			conn=getConnection();
			String sql="insert into board(writer=?,subject=?,password=?,email=?,reg_date=?,read_count=?,content=?)";
			sql+="values(?,?,?,?,now(),0,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, bdto.getWriter());
			pstmt.setString(2, bdto.getSubject());
			pstmt.setString(3, bdto.getPassword());
			pstmt.setString(4, bdto.getEmail());
			pstmt.setString(5, bdto.getContent());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null)  {try {conn.close();}  catch (SQLException e) {}}
		}
		
		
	}
	
	public BoardDTO2 getOneBoard(int num) {
		BoardDTO2 model = new BoardDTO2();
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement("update board set read_count=read_count+1 where num=?");
			pstmt.setInt(1,num);
			pstmt.executeUpdate();
			
			pstmt=conn.prepareStatement("select * from board where num=?");
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()) {
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
		}finally {
			if (rs != null)    {try {rs.close();}    catch (SQLException e) {}}
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null)  {try {conn.close();}  catch (SQLException e) {}}
		}
		
		
		return model;
	}
	
	public BoardDTO2 getOneUpdateBoard(int num) {
		BoardDTO2 model= new BoardDTO2();
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement("select * from board where num=?");
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()) {
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
		}finally {
			if (rs != null)    {try {rs.close();}    catch (SQLException e) {}}
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null)  {try {conn.close();}  catch (SQLException e) {}}
		}
		
		return model;
	}
	
	public boolean update(BoardDTO2 bdto) {
		boolean isUpdate =false;
		
		try {
			conn=getConnection();
			if(memberCheck(bdto)) {
				pstmt=conn.prepareStatement("update board set subject=?, content=? where num=?");
				pstmt.setString(1, bdto.getSubject());
				pstmt.setString(2, bdto.getContent());
				pstmt.setInt(3, bdto.getNum());
				pstmt.executeUpdate();
				isUpdate= true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null)  {try {conn.close();}  catch (SQLException e) {}}
		}
		return isUpdate;
	}
	
	
	
	public boolean delete(BoardDTO2 bdto) {
		boolean isDelete = false;
		try {
			conn=getConnection();
			if(memberCheck(bdto)) {
				pstmt=conn.prepareStatement("delete from board where num=?");
				pstmt.setInt(1,bdto.getNum());
				pstmt.executeUpdate();
				isDelete=true;
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null)  {try {conn.close();}  catch (SQLException e) {}}
		}
		return isDelete;
	}
	
	
	
	public boolean memberCheck(BoardDTO2 bdto) {
		boolean isMember = false;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement("select * from board where num=? and password=?");
			pstmt.setInt(1, bdto.getNum());
			pstmt.setString(2, bdto.getPassword());
			rs=pstmt.executeQuery();
			if(rs.next()) {
				isMember= true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (rs != null)    {try {rs.close();}    catch (SQLException e) {}}
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null)  {try {conn.close();}  catch (SQLException e) {}}
		}
		return isMember;
	}
	
	
}
