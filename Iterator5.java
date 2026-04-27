import java.util.LinkedList;
import java.util.Iterator;

public class Iterator5 {
    public static void main(String[] args){
        LinkedList<Member> members = new LinkedList<>();
        Iterator<Member> it = members.iterator();

        while (it.hasNext()){
            Member member = it.next();
            if (member.getYearsActive() < 1 || member.getStatus().equals("EXPIRED")){
                it.remove();
            }
        }
    }
}
