package Tests;

import static org.mockito.Mockito.*;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import HigherLower.ConsoleView;

public class ConsoleViewTest {

	private ConsoleView sut;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void shouldShowMenu() {
		PrintStream printStream = mock(PrintStream.class);
		sut = new ConsoleView(printStream);
		sut.showMenu();
		
		verify(printStream).println(ConsoleView.MENU);
	}
	
	@Test
	public void shouldAskUserForInput() {
		PrintStream printStream = mock(PrintStream.class);
		sut = new ConsoleView(printStream);
		sut.showInputInstruction();
		
		verify(printStream).println(ConsoleView.INPUTINSTRUCTION);
	}

}
