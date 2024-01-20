package GPT06;

class Dog {
    private int age;

    void setAge(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException("나이는 음수일 수 없습니다.");
        }
        this.age = age;
        System.out.println("강아지의 나이가 " + age + "살로 설정되었습니다.");
    }
}
