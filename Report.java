package solid.dip;

import java.util.ArrayList;
import java.util.List;

public class Report{
    private List<ReportItem> items; 

    public void calculate(){
        items = new ArrayList<>();
        items.add(newReportItem(description:"First",))
    }
    
}