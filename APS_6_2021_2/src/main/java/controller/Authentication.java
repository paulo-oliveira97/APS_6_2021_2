/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.machinezoo.sourceafis.FingerprintImage;
import com.machinezoo.sourceafis.FingerprintImageOptions;
import com.machinezoo.sourceafis.FingerprintMatcher;
import com.machinezoo.sourceafis.FingerprintTemplate;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author paulo
 */
public class Authentication {
      
    
    public static boolean compareFingerprint(String _probe, String _candidate) throws IOException {
        FingerprintTemplate probe = new FingerprintTemplate(
                new FingerprintImage(
                        Files.readAllBytes(Path.of(_probe)),
                        new FingerprintImageOptions().dpi(500)));

        FingerprintTemplate candidate = new FingerprintTemplate(
                new FingerprintImage(
                        Files.readAllBytes(Path.of(_candidate)),
                        new FingerprintImageOptions().dpi(500)));

        double score = new FingerprintMatcher(probe).match(candidate);
        double threshold = 40;
        boolean matches = score >= threshold; 
        return matches;
    }
}