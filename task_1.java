@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean actual = true;
	assertEquals("Возраст меньше нужного!", actual, isAdult);
}
