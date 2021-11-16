
package Model;

import java.util.Date;

public class tbPhongBan {
    String mabophan,maphong,tenphong;
    Date ngaythanhlap;
    String ghichu;

    public tbPhongBan() {
    }

    public tbPhongBan(String mabophan, String maphong, String tenphong, Date ngaythanhlap, String ghichu) {
        this.mabophan = mabophan;
        this.maphong = maphong;
        this.tenphong = tenphong;
        this.ngaythanhlap = ngaythanhlap;
        this.ghichu = ghichu;
    }

    public String getMabophan() {
        return mabophan;
    }

    public void setMabophan(String mabophan) {
        this.mabophan = mabophan;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public Date getNgaythanhlap() {
        return ngaythanhlap;
    }

    public void setNgaythanhlap(Date ngaythanhlap) {
        this.ngaythanhlap = ngaythanhlap;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    

}
