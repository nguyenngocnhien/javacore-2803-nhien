package OOP.category;

import java.util.Scanner;

public class NewsProgram {
    private String title,content,image,hashtag,author;
    private int idNews,uploadDate;
    Scanner sc = new Scanner(System.in);
    public NewsProgram() {
    }

    public NewsProgram(String title, String content, String image, String hashtag, String author, int idNews, int uploadDate) {
        this.title = title;
        this.content = content;
        this.image = image;
        this.hashtag = hashtag;
        this.author = author;
        this.idNews = idNews;
        this.uploadDate = uploadDate;
    }

    public void add(){
        System.out.println("Nhập tiêu đề : ");
        title = sc.nextLine();
        System.out.println("Nhập nội dung : ");
        content = sc.nextLine();
        System.out.println("Nhập ngày viết : ");
        uploadDate = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên tác giả : ");
        author = sc.nextLine();
        System.out.println("Nhập ID bài báo");
        idNews = sc.nextInt();
        sc.nextLine();

    }
    public void views() {
        System.out.println("Title : "+title);
        System.out.println("Nội dung : "+content);
        System.out.println("Tác giả : "+author);
        System.out.println("Ngày viết : "+uploadDate);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIdNews() {
        return idNews;
    }

    public void setIdNews(int idNews) {
        this.idNews = idNews;
    }

    public int getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(int uploadDate) {
        this.uploadDate = uploadDate;
    }
}
