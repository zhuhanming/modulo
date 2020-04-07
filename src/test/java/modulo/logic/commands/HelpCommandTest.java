package modulo.logic.commands;

import static modulo.commons.core.Messages.MESSAGE_SHOWING_HELP;
import static modulo.logic.commands.CommandTestUtil.assertCommandSuccess;

import org.junit.jupiter.api.Test;

import modulo.model.Model;
import modulo.model.ModelManager;

public class HelpCommandTest {
    private Model model = new ModelManager();
    private Model expectedModel = new ModelManager();

    @Test
    public void execute_help_success() {
        CommandResult expectedCommandResult = new CommandResult(MESSAGE_SHOWING_HELP, true, false, false, false, null);
        assertCommandSuccess(new HelpCommand(), model, expectedCommandResult, expectedModel);
    }

}
