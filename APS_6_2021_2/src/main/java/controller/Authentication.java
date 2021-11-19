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
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author paulo
 */
public class Authentication {
    
    int id;
    String name;
    FingerprintTemplate template;

    private Authentication findFingerprint(FingerprintTemplate probe, Iterable<Authentication> candidates) {
        FingerprintMatcher matcher = new FingerprintMatcher(probe);
        Authentication match = null;
        double high = 0;
        for (Authentication candidate : candidates) {
            double score = matcher.match(candidate.template);
            if (score > high) {
                high = score;
                match = candidate;
            }
        }
        double threshold = 40;
        return high >= threshold ? match : null;
    }

    private void compareFingerprint() throws IOException {
        FingerprintTemplate probe = new FingerprintTemplate(
                new FingerprintImage(
                        Files.readAllBytes(Paths.get("probe.png")),
                        new FingerprintImageOptions().dpi(500)));

        FingerprintTemplate candidate = new FingerprintTemplate(
                new FingerprintImage(
                        Files.readAllBytes(Paths.get("candidate.png")),
                        new FingerprintImageOptions().dpi(500)));

        double score = new FingerprintMatcher(probe).match(candidate);
        double threshold = 40;
        boolean matches = score >= threshold;
    }
}
