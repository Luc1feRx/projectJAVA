
package models;


public class tbThaiSan {
    String MaNV, MaBoPhan, MaPhong, HoTen, NgaySinh, NgayVeSinh, NgayLamLai, TroCap, GhiChu;

    public tbThaiSan() {
    }

    public tbThaiSan(String MaNV, String MaBoPhan, String MaPhong, String HoTen, String NgaySinh, String NgayVeSinh, String NgayLamLai, String TroCap, String GhiChu) {
        this.MaNV = MaNV;
        this.MaBoPhan = MaBoPhan;
        this.MaPhong = MaPhong;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.NgayVeSinh = NgayVeSinh;
        this.NgayLamLai = NgayLamLai;
        this.TroCap = TroCap;
        this.GhiChu = GhiChu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaBoPhan() {
        return MaBoPhan;
    }

    public void setMaBoPhan(String MaBoPhan) {
        this.MaBoPhan = MaBoPhan;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getNgayVeSinh() {
        return NgayVeSinh;
    }

    public void setNgayVeSinh(String NgayVeSinh) {
        this.NgayVeSinh = NgayVeSinh;
    }

    public String getNgayLamLai() {
        return NgayLamLai;
    }

    public void setNgayLamLai(String NgayLamLai) {
        this.NgayLamLai = NgayLamLai;
    }

    public String getTroCap() {
        return TroCap;
    }

    public void setTroCap(String TroCap) {
        this.TroCap = TroCap;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
}
