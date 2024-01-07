package GPT02;

public class User {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[2];
        items[0] = new LibraryItem("Java Programming", "John Doe", 2022);
        items[1] = new LibraryItem("Python Basics", "Jane Smith", 2021);

        items[0].checkout(); // Java Programming을 대출
        items[1].checkout(); // Python Basics를 대출

        items[0].checkout(); // 이미 대출 중인 책을 다시 대출 시도
        items[1].returnItem(); // Python Basics 반납
    }
}
