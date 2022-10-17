public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;


    Employee(String name,int salary, int workHours, int hireYear){
        this.name=name;
        this.salary = salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }


    public double tax(){
        double tax;
        if(this.salary<1000){
            tax=0;
        }
        else if(this.salary>1000){
            tax = this.salary*0.03;
        }
        else{tax=0;}
        return tax;
    }


    public int bonus(){
        int bonus;
        if(this.workHours>40){
            bonus = (this.workHours-40)*30;
        }
        else{
            bonus=0;
        }
        return bonus;
    }



    public double raiseSalary(){
        int now=2021;
        double raisesalary;
        if(now-this.hireYear<10){
            raisesalary= this.salary*0.05;
        }
        else if(now-hireYear<20&&now-hireYear>9){
            raisesalary = this.salary*0.10;
        }
        else if(now-hireYear>19){
            raisesalary = this.salary*0.15;
        }else{raisesalary=0;}
        return raisesalary;

    }

    public String toString(){
        return "Adı : "+this.name+"\n"+
        "Maaşı : "+this.salary+"\n"+
        "Çalışma Saati : "+this.workHours+"\n"+
        "Başlangıç Yılı : "+this.hireYear+"\n"+
        "Vergi : "+this.tax()+"\n"+
        "Bonus : "+this.bonus()+"\n"+
        "Maaş Artışı : "+this.raiseSalary()+"\n"+
        "Vergi ve Bonuslar ile birlikte maaş : "+(this.salary+this.bonus()-this.tax())+"\n"+
        "Toplam Maaş : "+(this.salary+this.raiseSalary());
    }











}
