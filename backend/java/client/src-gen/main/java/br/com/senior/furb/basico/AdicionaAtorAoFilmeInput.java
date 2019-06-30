package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class AdicionaAtorAoFilmeInput {
    
    /**
     * Nome do filme
     */
    public String filme;
    /**
     * Nome do genero
     */
    public String ator;
    
    public AdicionaAtorAoFilmeInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public AdicionaAtorAoFilmeInput(String filme, String ator) {
        this.filme = filme;
        this.ator = ator;
    }
    
    public void validate() {
        validate(true);
    }
    
    public void validate(boolean required) {
        validate(null, required);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	BasicoValidator.validate(this, headers, required, validated);
    }
    @Override
    public int hashCode() {
        int ret = 1;
        if (filme != null) {
            ret = 31 * ret + filme.hashCode();
        }
        if (ator != null) {
            ret = 31 * ret + ator.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdicionaAtorAoFilmeInput)) {
            return false;
        }
        AdicionaAtorAoFilmeInput other = (AdicionaAtorAoFilmeInput) obj;
        if ((filme == null) != (other.filme == null)) {
            return false;
        }
        if ((filme != null) && !filme.equals(other.filme)) {
            return false;
        }
        if ((ator == null) != (other.ator == null)) {
            return false;
        }
        if ((ator != null) && !ator.equals(other.ator)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	toString(sb, new ArrayList<>());
    	return sb.toString();
    }
    
    void toString(StringBuilder sb, List<Object> appended) {
    	sb.append(getClass().getSimpleName()).append(" [");
    	if (appended.contains(this)) {
    		sb.append("<Previously appended object>").append(']');
    		return;
    	}
    	appended.add(this);
    	sb.append("filme=").append(filme == null ? "null" : filme).append(", ");
    	sb.append("ator=").append(ator == null ? "null" : ator);
    	sb.append(']');
    }
    
}
