 public static List<Integer> gradingStudents(List<Integer> grades) {
    
List <Integer> sol=new ArrayList<Integer>();
        for(int i=0;i<grades.size();i++){
            if(grades.get(i)<38){
                sol.add(grades.get(i));
            }
            else {
                int reminder=grades.get(i)%5;
                if(reminder>2){
                    sol.add(grades.get(i)+5-reminder);
                }
                else sol.add(grades.get(i));
            }
        }
return sol;
    }
