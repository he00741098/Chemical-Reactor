//import java.math.BigDecimal;
//import java.io.PrintWriter.*;
import java.io.*;
import java.util.*;
import java.util.stream.*;
public class toFile{

    private List<String[]> dataLines = new ArrayList<String[]>();
    private String fileName="Default";
    public void setFileName(String name){fileName = name;}
    public String getFileName(){return fileName;}
    public void addData(String[] data){dataLines.add(data);}


    public String escapeSpecialCharacters(String data) {
        String escapedData = data.replaceAll("\\R", " ");
        if (data.contains(",") || data.contains("\"") || data.contains("'")) {
            data = data.replace("\"", "\"\"");
            escapedData = "\"" + data + "\"";
        }
        return escapedData;
    }

    public String convertToCSV(String[] data) {
        return Stream.of(data)
                .map(this::escapeSpecialCharacters)
                .collect(Collectors.joining(","));
    }

    public void trim(){
        for(int i = dataLines.size()-1; i>0; i--){
            String[] indexed = dataLines.get(i);
            String[] index = dataLines.get(i-1);
            boolean match = true;
            for(int k = 0; k<indexed.length; k++){
                if(!indexed[k].equals(index[k])){
                    match = false;
                }
            }
            if(match){
                dataLines.remove(i);
            }
        }


    }
    public void aTrim(){
        for(int i = dataLines.size()-1; i>0; i--){
            String[] indexed = dataLines.get(i);
            String[] index = dataLines.get(i-1);
            boolean match = true;

            if(!indexed[0].equals(index[0])){
                match = false;
            }

            if(match){
                dataLines.remove(i-1);
            }
        }


    }



    public void givenDataArray_whenConvertToCSV_thenOutputCreated() throws IOException {
        if(dataLines.size()<=1){
            return;
        }

        trim();
        aTrim();
        File csvOutputFile = new File(fileName+".csv");
        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
            dataLines.stream()
                    .map(this::convertToCSV)
                    .forEach(pw::println);
        }
        // assertTrue(csvOutputFile.exists());
    }





}