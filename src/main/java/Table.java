import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {
    private WebElement tableElement;
    private WebDriver driver;

    public Table(WebElement tableElement,WebDriver driver){
        this.tableElement = tableElement;
        this.driver = driver;
    }
    public List<WebElement> getRows(){
        List<WebElement> rows = tableElement.findElements(By.xpath(".//tr"));
        rows.remove(0);
        return rows;
    }
    public List<WebElement>getHeadings(){
        WebElement headingsRow = tableElement.findElement(By.xpath(".//tr[1]"));
        List<WebElement> headingsColumn = headingsRow.findElements(By.xpath(".//th"));
        return headingsColumn;
    }

    public List<List<WebElement>> getRowsWithColumns(){
        List<WebElement> rows = getRows();
        List<List<WebElement>> rowsWithColumns = new ArrayList<List<WebElement>>();
        for (WebElement row:rows) {
            List<WebElement> rowWithColumns = row.findElements(By.xpath(".//td"));
            rowsWithColumns.add(rowWithColumns);
        }
        return rowsWithColumns;
    }

    public List<Map<String,WebElement>> getRowWithColumnsByeHeadings(){
        List<List<WebElement>> rowsWithColumns = getRowsWithColumns();
        List<Map<String,WebElement>> rowsWithColumnsBYHeadings = new ArrayList<Map<String,WebElement>>();
        Map<String,WebElement> rowByHeadings;
        List<WebElement> headingColumns = getHeadings();

        for (List<WebElement> row : rowsWithColumns){
            rowByHeadings = new HashMap<String,WebElement>();
            for (int i = 0; i < headingColumns.size(); i++){
                String heading = headingColumns.get(i).getText();
                WebElement cell = row.get(i);
                rowByHeadings.put(heading,cell);
            }
            rowsWithColumnsBYHeadings.add(rowByHeadings);
        }
        return  rowsWithColumnsBYHeadings;
    }

    public String getValueFromCell(int rowNumber, int columnNumber){
        List<List<WebElement>> rowsWithColumns = getRowsWithColumns();
        WebElement cell = rowsWithColumns.get(rowNumber - 1).get(columnNumber - 1);
        return cell.getText();
    }

    public String getValueFromCell(int rowNumber, String columnName){
        List<Map<String,WebElement>> rowsWithColumnsByHeadings = getRowWithColumnsByeHeadings();
        return rowsWithColumnsByHeadings.get(rowNumber - 1).get(columnName).getText();

    }


}
