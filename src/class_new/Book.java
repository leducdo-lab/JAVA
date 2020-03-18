package class_new;

public class Book{
    private String book_name, tac_gia;
    private int soBook, bookMuon;

    public Book(){
        super();
    }

    public Book(String book_name, int soBook, int bookMuon, String tac_gia){
        this.book_name = book_name;
        this.tac_gia = tac_gia;
        this.soBook = soBook;
        this.bookMuon = bookMuon;
    }

    public void setBook_name(String book_name){
        this.book_name = book_name;
    }
    public String getBook_name(){
        return book_name;
    }

    public String get_tacGia(){
        return tac_gia;
    }
    

    public int get_qtyBook(){
        return soBook;
    }
    public int get_bookMuon(){
        return bookMuon;
    }
    public int get_bookLai(){
        return (soBook - bookMuon);
    }

    public void hienthi(){
        System.out.println("Tên sách: "+getBook_name());
        System.out.println("Tác Giả: "+get_tacGia());
        System.out.println("Số sách: "+get_qtyBook());
        System.out.println("Số sách mượn: "+get_bookMuon());
        System.out.println("Số sách còn lại: "+get_bookLai());
    }
}