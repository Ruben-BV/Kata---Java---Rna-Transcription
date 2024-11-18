package org.factoriaf5.rna_transcription;


public class RnaTranscription {
    
    String transcribe(String dnaStrand) {

        String[] rnaTranscription = new String[dnaStrand.length()];

        if (dnaStrand.isEmpty()) {
            return "";
        }
        else {
            for(int i=0; i<dnaStrand.length(); i++){
                switch (dnaStrand.charAt(i)) {
                    case 'C': rnaTranscription[i] = "G";
                    break;
                    case 'G': rnaTranscription[i] = "C";
                    break;
                    case 'T': rnaTranscription[i] = "A";
                    break;
                    case 'A': rnaTranscription[i] = "U";
                    break;
                }
            }
            String result = String.join("", rnaTranscription);
            return result;
        }

    }

}

