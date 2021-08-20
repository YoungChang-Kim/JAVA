package lab.itank.io;

import java.io.Serializable;

public class GameUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3272071793562218253L;
		
	private String id;
	private int level;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	transient private String netAddress;
	//transient 꼭 파일에 저장할 필요없는 데이터의 예약어
	
	public GameUser(String id, int level, String netAddress) {
		super();
		this.id = id;
		this.level = level;
		this.netAddress = netAddress;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getNetAddress() {
		return netAddress;
	}
	public void setNetAddress(String netAddress) {
		this.netAddress = netAddress;
	}

	@Override
	public String toString() {
		return "GameUser [id=" + id + ", level=" + level + ", netAddress=" + netAddress + "]";
	}
	
}
