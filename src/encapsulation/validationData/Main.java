package encapsulation.validationData;

import encapsulation.firstAndReserveTeam.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            people.add(new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));
        }

        Team team = new Team("Black Eagles");

        for (Person person : people) {
//            team.addPlayer(person);
        }

        System.out.println(team.getFirstTeam().size());
        System.out.println(team.getReserveTeam().size());
    }


}
