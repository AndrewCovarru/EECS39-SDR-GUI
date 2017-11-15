package windowBuilder.views;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JRadioButton;

/**
 * Created by jamespatrizi on 11/6/17.
 */

public class EnableOptionUiMatcher {

    private final Map<String, JRadioButton> mapper;

    public EnableOptionUiMatcher()
    {
        mapper = new HashMap<>();
    }

    public void add(String key, JRadioButton uiSwitch)
    {
        mapper.put(key, uiSwitch);
    }

    public void enableSwitchByString(homeScreen mainActivity, String value)
    {
        for (final String key : mapper.keySet())
        {
            if (key.equals(value))
            {
                mapper.get(key).setSelected(true);
            }
        }
    }

    public void uncheckAll()
    {
        for (final String key : mapper.keySet())
        {
            mapper.get(key).setSelected(false);
        }
    }


}
