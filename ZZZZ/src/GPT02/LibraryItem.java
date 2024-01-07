package GPT02;

//LibraryItem 클래스
public class LibraryItem extends Book {
 private boolean checkedOut;

 public LibraryItem(String title, String author, int publicationYear) {
     super(title, author, publicationYear);
     checkedOut = false;
 }

 public boolean isCheckedOut() {
     return checkedOut;
 }

 public void setCheckedOut(boolean checkedOut) {
     this.checkedOut = checkedOut;
 }

 public void checkout() {
     if (!checkedOut) {
         checkedOut = true;
         System.out.println(getTitle() + "이(가) 대출되었습니다.");
     } else {
         System.out.println(getTitle() + "은(는) 이미 대출 중입니다.");
     }
 }

 public void returnItem() {
     if (checkedOut) {
         checkedOut = false;
         System.out.println(getTitle() + "이(가) 반납되었습니다.");
     } else {
         System.out.println(getTitle() + "은(는) 대출 중이 아닙니다.");
     }
 }
}

