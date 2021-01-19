class Employee{
    public static void main(){
        String Employee[][]={{"Robert","1994","64C- WallsStreet"},{"Sam","2000","68D- WallsStreet"},{"John","1999","26B- WallsStreet"}};
        System.out.println("Name\t   Year of Joining\t    Address");
        for(int i=0;i<Employee.length;i++){
            for(int j=0;j<Employee.length;j++){
                System.out.print(Employee[i][j]+"\t\t");
    }
    System.out.println();
}
}
}