package funProjects;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InstagramPictureDownloader {
    public static void main(String[] args) throws IOException {
        // Replace "username" with the actual username of the Instagram account
        String username = "xyzzzzzz";

        // Build the URL for the user's profile page
        String profileUrl = "https://www.instagram.com/" + username + "/";

        // Download the HTML of the profile page
        String html = downloadUrl(profileUrl);

        // Extract the URL of the profile picture from the HTML
        String profilePictureUrl = extractProfilePictureUrl(html);

        // Download the profile picture and save it to a local file
        downloadAndSavePicture(profilePictureUrl, username + ".jpg");
    }

    private static String downloadUrl(String url) throws IOException {
        // Use the Java URL class to download the HTML of the URL
        InputStream inputStream = new URL(url).openStream();

        // Read the HTML into a string and return it
        return new String(inputStream.readAllBytes());
    }

    private static String extractProfilePictureUrl(String html) {
        // Use a regular expression to extract the URL of the profile picture from the HTML
        String regex = "https://.*jpg";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);

        if (matcher.find()) {
            return matcher.group();
        } else {
            return null;
        }
    }

    private static void downloadAndSavePicture(String url, String fileName) throws IOException {
        // Use the Java URL class to download the image
        InputStream inputStream = new URL(url).openStream();

        // Save the image to a local file
        Files.copy(inputStream, Paths.get(fileName), StandardCopyOption.REPLACE_EXISTING);
    }
}