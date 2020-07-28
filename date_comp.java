private int dateComp(String date1, String date2) {
        int result = 0;
        String[] datecheck1 = date1.split("-");
        String[] datecheck2 = date2.split("-");
        if (parseInt(datecheck1[2]) != parseInt(datecheck2[2]))//Year 
        {
            if (parseInt(datecheck1[1]) > parseInt(datecheck2[1]))// date1 is later because of the year 
            {
                return -1;
            } else {//  the 2nd date is later because of the year 
                return 1;
            }
            // return -1;
        } else {// same year
            if (parseInt(datecheck1[1]) != parseInt(datecheck2[1]))// if the month is different
            {
                if (parseInt(datecheck1[1]) > parseInt(datecheck2[1])) {
                    return -1;
                } else {
                    return 1;
                }
            } else {// same month 
                if (parseInt(datecheck1[0]) != parseInt(datecheck2[0])) // if the day is different 
                {
                    if (parseInt(datecheck1[0]) > parseInt(datecheck2[0])) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else {
                    return 0;// if both dates are the same then it returns 0 
                }//end of day
            }//end of month  
        }//year
    }