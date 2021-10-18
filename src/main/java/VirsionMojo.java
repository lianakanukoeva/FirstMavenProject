@Mojo(name = "version")
public final class VersionMojo extends AbstractMojo {

    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    public MavenProject project;

    public void execute() {
        getLog().info("Project version: " + project.getVersion());
    }
}