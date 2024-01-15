package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        Memberinit member1 = new Memberinit();
        initMember(member1, "usr1",15,90);

        Memberinit member2 = new Memberinit();
        initMember(member2, "usr2",16,80);


        Memberinit[] members = new Memberinit[]{member1, member2};

        for (Memberinit member : members) {
            System.out.print("member Name : " + member.name);
            System.out.print(" | member Age : " + member.age);
            System.out.println(" | member Score : " + member.score);
        }
    }

    static void initMember(Memberinit member, String name, int age, int score) {
        member.name = name;
        member.age = age;
        member.score = score;
    }
}
