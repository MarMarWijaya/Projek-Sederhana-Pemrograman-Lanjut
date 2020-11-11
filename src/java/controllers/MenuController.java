/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static controllers.DaftarController.conn;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Mario Wijaya
 */
@ManagedBean(name = "order")
@SessionScoped
public class MenuController implements Serializable {

    private static final ArrayList<Order> a = new ArrayList<Order>(Arrays.asList());

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    private static final long serialVersionUID = 1L;

    String productName;
    int price;
    int qty;
    String note;

    String productName1;
    int price1;
    int qty1;
    String note1;

    String productName2;
    int price2;
    int qty2;
    String note2;

    String productName3;
    int price3;
    int qty3;
    String note3;

    String productName4;
    int price4;
    int qty4;
    String note4;

    String productName5;
    int price5;
    int qty5;
    String note5;

    String productName6;
    int price6;
    int qty6;
    String note6;

    String productName7;
    int price7;
    int qty7;
    String note7;

    String productName8;
    int price8;
    int qty8;
    String note8;

    String productName9;
    int price9;
    int qty9;
    String note9;

    String productName10;
    int price10;
    int qty10;
    String note10;

    String productName11;
    int price11;
    int qty11;
    String note11;

    String productName12;
    int price12;
    int qty12;
    String note12;

    String productName13;
    int price13;
    int qty13;
    String note13;

    String productName14;
    int price14;
    int qty14;
    String note14;

    String productName15;
    int price15;
    int qty15;
    String note15;

    String productName16;
    int price16;
    int qty16;
    String note16;

    String productName17;
    int price17;
    int qty17;
    String note17;

    String productName18;
    int price18;
    int qty18;
    String note18;

    String productName19;
    int price19;
    int qty19;
    String note19;

    static String username;

    public void setUsername(String usr) {
        username = usr;
    }

    public String getUsername() {
        return username;
    }

    public String getProductName2() {
        return productName2;
    }

    public void setProductName2(String productName2) {
        this.productName2 = productName2;
    }

    public int getPrice2() {
        return price2;
    }

    public void setPrice2(int price2) {
        this.price2 = price2;
    }

    public int getQty2() {
        return qty2;
    }

    public void setQty2(int qty2) {
        this.qty2 = qty2;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public String getProductName3() {
        return productName3;
    }

    public void setProductName3(String productName3) {
        this.productName3 = productName3;
    }

    public int getPrice3() {
        return price3;
    }

    public void setPrice3(int price3) {
        this.price3 = price3;
    }

    public int getQty3() {
        return qty3;
    }

    public void setQty3(int qty3) {
        this.qty3 = qty3;
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }

    public String getProductName4() {
        return productName4;
    }

    public void setProductName4(String productName4) {
        this.productName4 = productName4;
    }

    public int getPrice4() {
        return price4;
    }

    public void setPrice4(int price4) {
        this.price4 = price4;
    }

    public int getQty4() {
        return qty4;
    }

    public void setQty4(int qty4) {
        this.qty4 = qty4;
    }

    public String getNote4() {
        return note4;
    }

    public void setNote4(String note4) {
        this.note4 = note4;
    }

    public String getProductName5() {
        return productName5;
    }

    public void setProductName5(String productName5) {
        this.productName5 = productName5;
    }

    public int getPrice5() {
        return price5;
    }

    public void setPrice5(int price5) {
        this.price5 = price5;
    }

    public int getQty5() {
        return qty5;
    }

    public void setQty5(int qty5) {
        this.qty5 = qty5;
    }

    public String getNote5() {
        return note5;
    }

    public void setNote5(String note5) {
        this.note5 = note5;
    }

    public String getProductName6() {
        return productName6;
    }

    public void setProductName6(String productName6) {
        this.productName6 = productName6;
    }

    public int getPrice6() {
        return price6;
    }

    public void setPrice6(int price6) {
        this.price6 = price6;
    }

    public int getQty6() {
        return qty6;
    }

    public void setQty6(int qty6) {
        this.qty6 = qty6;
    }

    public String getNote6() {
        return note6;
    }

    public void setNote6(String note6) {
        this.note6 = note6;
    }

    public String getProductName7() {
        return productName7;
    }

    public void setProductName7(String productName7) {
        this.productName7 = productName7;
    }

    public int getPrice7() {
        return price7;
    }

    public void setPrice7(int price7) {
        this.price7 = price7;
    }

    public int getQty7() {
        return qty7;
    }

    public void setQty7(int qty7) {
        this.qty7 = qty7;
    }

    public String getNote7() {
        return note7;
    }

    public void setNote7(String note7) {
        this.note7 = note7;
    }

    public String getProductName8() {
        return productName8;
    }

    public void setProductName8(String productName8) {
        this.productName8 = productName8;
    }

    public int getPrice8() {
        return price8;
    }

    public void setPrice8(int price8) {
        this.price8 = price8;
    }

    public int getQty8() {
        return qty8;
    }

    public void setQty8(int qty8) {
        this.qty8 = qty8;
    }

    public String getNote8() {
        return note8;
    }

    public void setNote8(String note8) {
        this.note8 = note8;
    }

    public String getProductName9() {
        return productName9;
    }

    public void setProductName9(String productName9) {
        this.productName9 = productName9;
    }

    public int getPrice9() {
        return price9;
    }

    public void setPrice9(int price9) {
        this.price9 = price9;
    }

    public int getQty9() {
        return qty9;
    }

    public void setQty9(int qty9) {
        this.qty9 = qty9;
    }

    public String getNote9() {
        return note9;
    }

    public void setNote9(String note9) {
        this.note9 = note9;
    }

    public String getProductName10() {
        return productName10;
    }

    public void setProductName10(String productName10) {
        this.productName10 = productName10;
    }

    public int getPrice10() {
        return price10;
    }

    public void setPrice10(int price10) {
        this.price10 = price10;
    }

    public int getQty10() {
        return qty10;
    }

    public void setQty10(int qty10) {
        this.qty10 = qty10;
    }

    public String getNote10() {
        return note10;
    }

    public void setNote10(String note10) {
        this.note10 = note10;
    }

    public String getProductName11() {
        return productName11;
    }

    public void setProductName11(String productName11) {
        this.productName11 = productName11;
    }

    public int getPrice11() {
        return price11;
    }

    public void setPrice11(int price11) {
        this.price11 = price11;
    }

    public int getQty11() {
        return qty11;
    }

    public void setQty11(int qty11) {
        this.qty11 = qty11;
    }

    public String getNote11() {
        return note11;
    }

    public void setNote11(String note11) {
        this.note11 = note11;
    }

    public String getProductName12() {
        return productName12;
    }

    public void setProductName12(String productName12) {
        this.productName12 = productName12;
    }

    public int getPrice12() {
        return price12;
    }

    public void setPrice12(int price12) {
        this.price12 = price12;
    }

    public int getQty12() {
        return qty12;
    }

    public void setQty12(int qty12) {
        this.qty12 = qty12;
    }

    public String getNote12() {
        return note12;
    }

    public void setNote12(String note12) {
        this.note12 = note12;
    }

    public String getProductName13() {
        return productName13;
    }

    public void setProductName13(String productName13) {
        this.productName13 = productName13;
    }

    public int getPrice13() {
        return price13;
    }

    public void setPrice13(int price13) {
        this.price13 = price13;
    }

    public int getQty13() {
        return qty13;
    }

    public void setQty13(int qty13) {
        this.qty13 = qty13;
    }

    public String getNote13() {
        return note13;
    }

    public void setNote13(String note13) {
        this.note13 = note13;
    }

    public String getProductName14() {
        return productName14;
    }

    public void setProductName14(String productName14) {
        this.productName14 = productName14;
    }

    public int getPrice14() {
        return price14;
    }

    public void setPrice14(int price14) {
        this.price14 = price14;
    }

    public int getQty14() {
        return qty14;
    }

    public void setQty14(int qty14) {
        this.qty14 = qty14;
    }

    public String getNote14() {
        return note14;
    }

    public void setNote14(String note14) {
        this.note14 = note14;
    }

    public String getProductName15() {
        return productName15;
    }

    public void setProductName15(String productName15) {
        this.productName15 = productName15;
    }

    public int getPrice15() {
        return price15;
    }

    public void setPrice15(int price15) {
        this.price15 = price15;
    }

    public int getQty15() {
        return qty15;
    }

    public void setQty15(int qty15) {
        this.qty15 = qty15;
    }

    public String getNote15() {
        return note15;
    }

    public void setNote15(String note15) {
        this.note15 = note15;
    }

    public String getProductName16() {
        return productName16;
    }

    public void setProductName16(String productName16) {
        this.productName16 = productName16;
    }

    public int getPrice16() {
        return price16;
    }

    public void setPrice16(int price16) {
        this.price16 = price16;
    }

    public int getQty16() {
        return qty16;
    }

    public void setQty16(int qty16) {
        this.qty16 = qty16;
    }

    public String getNote16() {
        return note16;
    }

    public void setNote16(String note16) {
        this.note16 = note16;
    }

    public String getProductName17() {
        return productName17;
    }

    public void setProductName17(String productName17) {
        this.productName17 = productName17;
    }

    public int getPrice17() {
        return price17;
    }

    public void setPrice17(int price17) {
        this.price17 = price17;
    }

    public int getQty17() {
        return qty17;
    }

    public void setQty17(int qty17) {
        this.qty17 = qty17;
    }

    public String getNote17() {
        return note17;
    }

    public void setNote17(String note17) {
        this.note17 = note17;
    }

    public String getProductName18() {
        return productName18;
    }

    public void setProductName18(String productName18) {
        this.productName18 = productName18;
    }

    public int getPrice18() {
        return price18;
    }

    public void setPrice18(int price18) {
        this.price18 = price18;
    }

    public int getQty18() {
        return qty18;
    }

    public void setQty18(int qty18) {
        this.qty18 = qty18;
    }

    public String getNote18() {
        return note18;
    }

    public void setNote18(String note18) {
        this.note18 = note18;
    }

    public String getProductName19() {
        return productName19;
    }

    public void setProductName19(String productName19) {
        this.productName19 = productName19;
    }

    public int getPrice19() {
        return price19;
    }

    public void setPrice19(int price19) {
        this.price19 = price19;
    }

    public int getQty19() {
        return qty19;
    }

    public void setQty19(int qty19) {
        this.qty19 = qty19;
    }

    public String getNote19() {
        return note19;
    }

    public void setNote19(String note19) {
        this.note19 = note19;
    }

    public String getProductName1() {
        return productName1;
    }

    public void setProductName1(String productName1) {
        this.productName1 = productName1;
    }

    public int getPrice1() {
        return price1;
    }

    public void setPrice1(int price1) {
        this.price1 = price1;
    }

    public int getQty1() {
        return qty1;
    }

    public void setQty1(int qty1) {
        this.qty1 = qty1;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String deleteAction(Order order) {
        a.remove(order);

        return null;
    }

    public String Test(Order order) {
        return "index";
    }

    public String addAction() {
        Order order = new Order("Nasi Goreng", 12000 * this.qty,
                this.qty, this.note, this.username);
        a.add(order);
        return null;
    }

    public String addAction1() {
        Order order = new Order("Mie Goreng", 13000 * this.qty1,
                this.qty1, this.note1, this.username);
        a.add(order);
        return null;
    }

    public String addAction2() {
        Order order = new Order("Mie Rebus", 13000 * this.qty2,
                this.qty2, this.note2, this.username);
        a.add(order);
        return null;
    }

    public String addAction3() {
        Order order = new Order("Ayam Goreng", 18000 * this.qty3,
                this.qty3, this.note3, this.username);
        a.add(order);
        return null;
    }

    public String addAction4() {
        Order order = new Order("Beef Burger", 21000 * this.qty4,
                this.qty4, this.note4, this.username);
        a.add(order);
        return null;
    }

    public String addAction5() {
        Order order = new Order("Spaghetti", 20000 * this.qty5,
                this.qty5, this.note5, this.username);
        a.add(order);
        return null;
    }

    public String addAction6() {
        Order order = new Order("Mendoan", 7000 * this.qty6,
                this.qty6, this.note6, this.username);
        a.add(order);
        return null;
    }

    public String addAction7() {
        Order order = new Order("Singkong Crispy", 7500 * this.qty7,
                this.qty7, this.note7, this.username);
        a.add(order);
        return null;
    }

    public String addAction8() {
        Order order = new Order("French Fries", 8000 * this.qty8,
                this.qty8, this.note8, this.username);
        a.add(order);
        return null;
    }

    public String addAction9() {
        Order order = new Order("Ropang", 8000 * this.qty9,
                this.qty9, this.note9, this.username);
        a.add(order);
        return null;
    }

    public String addAction10() {
        Order order = new Order("Teh", 5000 * this.qty10,
                this.qty10, this.note10, this.username);
        a.add(order);
        return null;
    }

    public String addAction11() {
        Order order = new Order("Milkshake", 10000 * this.qty11,
                this.qty11, this.note11, this.username);
        a.add(order);
        return null;
    }

    public String addAction12() {
        Order order = new Order("Mojito", 12000 * this.qty12,
                this.qty12, this.note12, this.username);
        a.add(order);
        return null;
    }

    public String addAction13() {
        Order order = new Order("Lemon Squash", 15000 * this.qty13,
                this.qty13, this.note13, this.username);
        a.add(order);
        return null;
    }

    public String addAction14() {
        Order order = new Order("Cappuccino", 11000 * this.qty14,
                this.qty14, this.note14, this.username);
        a.add(order);
        return null;
    }

    public String addAction15() {
        Order order = new Order("Root Beer Float", 15000 * this.qty15,
                this.qty15, this.note15, this.username);
        a.add(order);
        return null;
    }

    public String addAction16() {
        Order order = new Order("Jus Buah", 12000 * this.qty16,
                this.qty16, this.note16, this.username);
        a.add(order);
        return null;
    }

    public String addAction17() {
        Order order = new Order("Jahe Rempah", 7500 * this.qty17,
                this.qty17, this.note17, this.username);
        a.add(order);
        return null;
    }

    public String addAction18() {
        Order order = new Order("Boba Tea", 12000 * this.qty18,
                this.qty18, this.note18, this.username);
        a.add(order);
        return null;
    }

    public String addAction19() {
        Order order = new Order("Aqua", 3000 * this.qty19,
                this.qty19, this.note19, this.username);
        a.add(order);
        return null;
    }

    public ArrayList<Order> getA() {
        return a;
    }

    public static class Order {

        String orderNo;
        static String usrname;
        String productName;
        int price = 0;
        int qty;
        String note;

        ArrayList<String> pesanan = new ArrayList();
        ArrayList<String> totalHarga = new ArrayList();
        ArrayList<String> jumlah = new ArrayList();
        ArrayList<String> catatan = new ArrayList();
        static ArrayList<String> ker = new ArrayList();
        static ArrayList<Integer> ker2 = new ArrayList();
        static ArrayList<Integer> ker3 = new ArrayList();

        public Order(String productName, int price, int qty, String note, String usr) {
            this.productName = productName;
            this.price = price;
            this.qty = qty;
            this.note = note;
            this.usrname = usr;
            pesanan.add(productName);
            jumlah.add(Integer.toString(qty));
            catatan.add(note);
            ker.add(getDataPesanan());
            setFix(totalHarga(price));
            System.out.println("Apalah : " + percobaan());
        }

        String data;
        int harga;
        static int fix;

        public int getFix() {
            return fix;
        }

        public void setFix(int fix) {
            this.fix = fix;
        }

        public int totalHarga(int x) {
            ker2.add(x);
            for (int i = 0; i < ker2.size(); i++) {
                harga += ker2.get(i);
            }
            System.out.println("Isi harga : " + ker2);
            System.out.println("Harga fix : " + harga);
            setFix(harga);
            System.out.println("Ini fix : " + getFix());
            return harga;
        }
        int h;

        public int percobaan() {
            for (int i = 0; i < ker3.size(); i++) {
                h += ker3.get(i);
            }
            return h;
        }

        public String getDataPesanan() {
            System.out.println(pesanan.size());
            for (int i = 0; i < pesanan.size(); i++) {
                data = pesanan.get(i).concat(jumlah.get(i)).concat(catatan.get(i));
            }
            System.out.println(data);
            return data;
        }

        public String getPesananInString() {
            String str = "";
            for (String s : pesanan) {
                str += s + " ";
            }
            return str;
        }

        public String getHargaInString() {
            String str = "";
            for (String s : totalHarga) {
                str += s + " ";
            }
            return str;
        }

        public String getJumlahInString() {
            String str = "";
            for (String s : jumlah) {
                str += s + " ";
            }
            return str;
        }

        public String getCatatanInString() {
            String str = "";
            for (String s : catatan) {
                str += s + " ";
            }
            return str;
        }

        public String konfirmasi() {
            try {
                System.out.println("Harga di konfirmasi : " + getFix());
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/tts_pl", "root", "");
                stmt = conn.createStatement();
                String sql = "INSERT INTO transaksi(username, pesanan, harga) VALUES "
                        + "("
                        + "'" + usrname + "',"
                        + "'" + ker.toString() + "',"
                        + "'" + getFix() + "')";

                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                return "keranjang";
            } catch (Exception e) {
                System.out.println(e);
                return "beranda";
            }

        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public int getPrice() {
            ker3.add(price);
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }
    }
}
