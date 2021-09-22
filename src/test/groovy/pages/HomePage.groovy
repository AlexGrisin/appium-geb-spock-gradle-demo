package pages

import geb.Page
import module.SearchBar
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot

class HomePage extends Page
{

    static Closure at = { $('body.page-homepage') }

    static Closure content = {
        searchBar { module SearchBar }
    }

    void search(String searchTerm)
    {
        println 'Screenshot taken: ' + takeScreenshot('test')
        searchBar.searchInput.value(searchTerm)
        searchBar.searchBtn.click()
    }

    boolean takeScreenshot(final String name) {
        String screenshotDirectory = '/screenshots'//System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""))
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
    }
}
