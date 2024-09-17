package library;

import target.SchoolManagementApp;

public class LibrarySystemAdapter implements SchoolManagementApp {
    private LibrarySystem librarySystem;

    public LibrarySystemAdapter() {

    }

    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }

    public LibrarySystem getLibrarySystem() {
        return librarySystem;
    }

    public void setLibrarySystem(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }

    @Override
    public void integrateSystem() {
        librarySystem.manageBooks();
    }
}
