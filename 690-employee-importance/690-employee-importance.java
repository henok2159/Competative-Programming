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
        HashMap<Integer,Employee>hm=new HashMap();
        for(Employee em:employees){
           hm.put(em.id,em);
            }
        findImportance(hm,hm.get(id));
        
        return importance;
    }
    
    int findImportance(HashMap<Integer,Employee>hm,Employee em){
       importance+=em.importance ;
        
        for(int sub:em.subordinates){
          findImportance(hm,hm.get(sub));
        }
        return importance;
    }
}