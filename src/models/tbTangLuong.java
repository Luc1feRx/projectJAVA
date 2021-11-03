
package models;

public class tbTangLuong {
    String MaNV, HoTen, GioiTinh, ChucVu, MaLuongCu, MaLuongMoi, NgayTang, LyDo;

    public tbTangLuong() {
    }

    public tbTangLuong(String MaNV, String HoTen, String GioiTinh, String ChucVu, String MaLuongCu, String MaLuongMoi, String NgayTang, String LyDo) {
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.ChucVu = ChucVu;
        this.MaLuongCu = MaLuongCu;
        this.MaLuongMoi = MaLuongMoi;
        this.NgayTang = NgayTang;
        this.LyDo = LyDo;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getMaLuongCu() {
        return MaLuongCu;
    }

    public void setMaLuongCu(String MaLuongCu) {
        this.MaLuongCu = MaLuongCu;
    }

    public String getMaLuongMoi() {
        return MaLuongMoi;
    }

    public void setMaLuongMoi(String MaLuongMoi) {
        this.MaLuongMoi = MaLuongMoi;
    }

    public String getNgayTang() {
        return NgayTang;
    }

    public void setNgayTang(String NgayTang) {
        this.NgayTang = NgayTang;
    }

    public String getLyDo() {
        return LyDo;
    }

    public void setLyDo(String LyDo) {
        this.LyDo = LyDo;
    }
    
}
