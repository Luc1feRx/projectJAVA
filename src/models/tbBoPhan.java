
package Model;

import java.util.Date;

public class tbBoPhan {
    String mabophan, tenbophan;
    Date ngaythanhlap;
    String ghichu;

    public tbBoPhan() {
    }

    public tbBoPhan(String mabophan, String tenbophan, Date ngaythanhlap, String ghichu) {
        this.mabophan = mabophan;
        this.tenbophan = tenbophan;
        this.ngaythanhlap = ngaythanhlap;
        this.ghichu = ghichu;
    }

    public String getMabophan() {
        return mabophan;
    }

    public void setMabophan(String mabophan) {
        this.mabophan = mabophan;
    }

    public String getTenbophan() {
        return tenbophan;
    }

    public void setTenbophan(String tenbophan) {
        this.tenbophan = tenbophan;
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
