package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";

        System.out.println("영화 제목:" + inception.title + ", 리뷰:" + inception.review);
        System.out.println("영화 제목:" + aboutTime.title + ", 리뷰:" + aboutTime.review);


        /*MovieReviewMain movieReviewMain = new MovieReviewMain();

        String title1 = "인셉션";
        String review1 = "인생은 무한 루프";

        String title2 = "어바웃 타입";
        String review2 = "인생 시간 영화";

        System.out.println("영화 제목:" + title1 + " 리뷰:" + review1);
        System.out.println("영화 제목:" + title2 + " 리뷰:" + review2);*/
    }
}
