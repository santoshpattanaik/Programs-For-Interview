package allprogram.normal;

import java.util.*;

class EmployeeRecord implements Comparator<Map.Entry> {
    int id;
    String name;

    public EmployeeRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public EmployeeRecord() {

    }

    @Override
    public int compare(Map.Entry o1, Map.Entry o2) {
       // System.out.println();
        int doj1=Integer.parseInt(o1.getValue().toString());
        int doj2=Integer.parseInt(o2.getValue().toString());
        System.out.println(doj1+" compare "+doj2);
        if ( doj2 > doj1)
            return 1;
        else if ( doj2< doj1)
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object obj){

        if(this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        EmployeeRecord record = (EmployeeRecord) obj;
        System.out.println("record.id == this.id && record.name == this.name\n" +" "+ record.id +" == "+ this.id +" && "+ record.name+" == "+this.name
        +" is "+(record.id == this.id ));
        return  (record.id == this.id );
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode: "+id);
        return id;
    }


    @Override
    public String toString(){
        return id+":"+name;
    }
}

public class SortHashmapWRTEmployeeAndDOJ {
    public static void main(String[] args) {
        Map<EmployeeRecord,Integer> empMap = new HashMap<>();
        EmployeeRecord emp1 = new EmployeeRecord(1,"Santosh");
        EmployeeRecord emp2 = new EmployeeRecord(2,"Ashish");
        EmployeeRecord emp3 = new EmployeeRecord(3,"Sanjay");
        EmployeeRecord emp4 = new EmployeeRecord(4,"Suman");
        empMap.put(emp1,20200101);
        empMap.put(emp2,20200201);
        empMap.put(emp3,20200301);
        empMap.put(emp4,20200401);
        System.out.println("Map before Sorting by DOJ: "+empMap);

        List<Map.Entry> empEntryList = new ArrayList<>();
        for (Map.Entry entry:empMap.entrySet()){
            empEntryList.add(entry);
        }
        System.out.println("List before Sorting: "+empEntryList);
        Collections.sort(empEntryList,new EmployeeRecord());
        System.out.println("List after Sorting: "+empEntryList);
        Map<EmployeeRecord,Integer> linkedMap = new LinkedHashMap<>();
        for (Map.Entry entry:empEntryList){
            EmployeeRecord e1 = (EmployeeRecord) entry.getKey();
            Integer doj = (Integer) entry.getValue();
            linkedMap.put(e1,doj);
            // linkedMap.put((EmployeeRecord) entry.getKey(),Integer.parseInt(entry.getValue().toString()));
        }
        System.out.println("Map after Sorting by DOJ: "+linkedMap);
    }
    }
