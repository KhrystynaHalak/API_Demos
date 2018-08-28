package Pages;

import Tools.ASearch;
import Tools.ISearch;
import org.openqa.selenium.WebElement;

public class AlertDialogsPage {

    public ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    public WebElement okCancelDialogWithMessage(){
        return Search.Id("com.example.android.apis:id/two_buttons");
    }

    public WebElement okCancelDialogWithLongMessage(){
        return Search.Id("com.example.android.apis:id/two_buttons2");
    }

    public WebElement okCancelDialogWithUltraLongMessage(){
        return Search.Id("com.example.android.apis:id/two_buttons2ultra");
    }

    public WebElement listDialog(){
        return Search.Id("com.example.android.apis:id/select_button");
    }

    public WebElement progressBarDialog(){
        return Search.Id("com.example.android.apis:id/progress_button");
    }

    public WebElement progressSpinnerDialog(){
        return Search.Id("com.example.android.apis:id/progress_spinner_button");
    }

    public WebElement singleChoiceList(){
        return Search.Id("com.example.android.apis:id/radio_button");
    }

    public WebElement repeatAlarm(){
        return Search.Id("com.example.android.apis:id/checkbox_button");
    }

    public WebElement sendCallToVoiceMail(){
        return Search.Id("com.example.android.apis:id/checkbox_button2");
    }

    public WebElement textEntryDialog(){
        return Search.Id("com.example.android.apis:id/text_entry_button");
    }

    public WebElement okCancelDialogWithTraditionalTheme(){
        return Search.Id("com.example.android.apis:id/two_buttons_old_school");
    }

    public WebElement OkCancelDialogWithHoloLightTheme(){
        return Search.Id("com.example.android.apis:id/two_buttons_holo_light");
    }





}
