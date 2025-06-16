package Year1.Semester1.Lesson8.Ex2;

public class Main {
    public static Member mostProductiveMember(Task[] allTasks){
        int mostCounter = 0;
        Member member = allTasks[0].memberHeadTask;
        for (int i = 0; i < allTasks.length; i++) {
            int counter = 0;
            if (!(allTasks[i].memberHeadTask.team.groupManager == allTasks[i].memberHeadTask) && allTasks[i].status == 2){
                Member currMember = allTasks[i].memberHeadTask;
                for (int j = 0; j < allTasks.length; j++) {
                    if (currMember == allTasks[j].memberHeadTask){
                        counter++;
                    }
                }
                if (counter > mostCounter){
                    mostCounter = counter;
                    member = currMember;
                }
            }
        }
        return member;
    }

    public static void main(String[] args) {
        Member member1 = new Member();
        member1.firstName = "Alice";
        member1.lastName = "Johnson";
        member1.description = "Backend Developer";
        member1.yearInCompany = 3;
        member1.yearsInTech = 5;

        Member member2 = new Member();
        member2.firstName = "Bob";
        member2.lastName = "Smith";
        member2.description = "Frontend Developer";
        member2.yearInCompany = 2;
        member2.yearsInTech = 4;

        Member member3 = new Member();
        member3.firstName = "Carol";
        member3.lastName = "Brown";
        member3.description = "Full Stack Developer";
        member3.yearInCompany = 5;
        member3.yearsInTech = 8;


        Team team1 = new Team();
        team1.teamName = "Alpha Team";
        team1.groupManager = member2;

        Team team2 = new Team();
        team2.teamName = "Beta Team";
        team2.groupManager = member3;


        member1.team = team1;
        member2.team = team1;
        member3.team = team2;


        Task task1 = new Task();
        task1.description = "Develop the API for the new project";
        task1.memberHeadTask = member1;
        task1.status = 2;
        task1.taskType = 2;

        Task task2 = new Task();
        task2.description = "Design the frontend layout";
        task2.memberHeadTask = member2;
        task2.status = 0;
        task2.taskType = 3;

        Task task3 = new Task();
        task3.description = "Integrate backend with frontend";
        task3.memberHeadTask = member2;
        task3.status = 2;
        task3.taskType = 4;

        Task[] tasks = {task1, task2, task3};

        System.out.println(mostProductiveMember(tasks).firstName);
    }
}
