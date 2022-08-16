/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    int importance=0;
    public int getImportance(List<Employee> employees, int id) {
        for(Employee em:employees){
            if(em.id==id){
                findImportance(employees,em);
                break;
            }
        }
        return importance;
    }
    
    int findImportance(List<Employee>employees,Employee em){
       importance+=em.importance ;
        for(int sub:em.subordinates){
            for(Employee e:employees){
                if(e.id==sub){
                    findImportance(employees,e);
                }
            }
        }
        return importance;
    }
}