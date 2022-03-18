import java.util.Objects;

public class VideoAdapter {
    private String name;
    private String videoRam;

    public VideoAdapter(String name, String videoRam) {
        this.name = name;
        this.videoRam = videoRam;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoAdapter that = (VideoAdapter) o;
        return Objects.equals(name, that.name)
                && Objects.equals(videoRam, that.videoRam);
    }

//    @Override
//    public int hashCode() {
//        return 0;
//    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\nname: ");
        stringBuilder.append(this.name);
        stringBuilder.append("\nvideoRam: ");
        stringBuilder.append("\n");
        stringBuilder.append(this.videoRam);
        return stringBuilder.toString();
        //return "\nname: " + this.name + "\nvideoRam: " + this.videoRam;
    }

}

