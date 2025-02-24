package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import seedu.address.model.tag.Tag;

/**
 * An UI component that displays information of a {@code Tag}.
 */
public class TagCard extends UiPart<Region> {

    private static final String FXML = "TagListCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */
    public final Tag tag;

    @FXML
    private Label tagName;
    @FXML
    private Label tagCategory;
    @FXML
    private HBox cardPane;


    /**
     * Creates a {@code PersonCode} with the given {@code Person} and index to display.
     */
    public TagCard(Tag tag) {
        super(FXML);
        this.tag = tag;
        tagName.setText("Tag Name: " + tag.getTagName());
        tagCategory.setText("Category: " + tag.getTagCategory());
    }
}
