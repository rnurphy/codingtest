package codingtest.ct.week02;

import java.util.List;
import java.util.Vector;

public class Ex0205 {
	public static void main(String[] args) {
		Board board = new Board();
		board.setTtl("제목1");
		board.setCn("내용1");
		board.setWriter("작성자1");
		List<Board> list = new Vector<Board>();
		list.add(board);
		list.add(new Board("제목2", "내용2", "작성자2"));
		list.add(new Board("제목3", "내용3", "작성자3"));
		list.add(new Board("제목4", "내용4"));
		
		System.out.println(list.toString());
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getTtl() + " : " + b.getCn() + " : " + b.getWriter());
		}
	}
	
}

class Board {
	private String ttl;
	private String cn;
	private String writer;
	
	public Board() {};
	public Board(String ttl, String cn, String writer) {
		this.ttl = ttl;
		this.cn = cn;
		this.writer = writer;
	}
	
	public Board(String ttl, String cn) {
		this.ttl = ttl;
		this.cn = cn;
		this.writer = "관리자";
	}
	
	public String getTtl() {
		return ttl;
	}
	public void setTtl(String ttl) {
		this.ttl = ttl;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
}
