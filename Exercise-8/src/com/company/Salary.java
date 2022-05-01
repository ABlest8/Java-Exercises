package com.company;

public interface Salary {
    int salaryToPayYILDIRIM56462(int hours, int rate);

    default int salaryForOvertimeYILDIRIM56462(int overtime, int overtimeRate){
        int overtimePaymentYILDIRIM56462 = overtime * overtimeRate;
        return overtimePaymentYILDIRIM56462;
    }

    static int bonusCheckerYILDIRIM56462(int yearsOfExperience){
        if (yearsOfExperience>=5){
            return 50;
        }
        else{
            return 0;
        }
    }
}
