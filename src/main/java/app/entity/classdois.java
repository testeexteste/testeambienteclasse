package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CLASSDOIS
 * @generated
 */
@Entity
@Table(name = "\"CLASSDOIS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.classdois")
public class classdois implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "attribute_01", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_01;

  /**
  * @generated
  */
  @Column(name = "attribute_02", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_02;

  /**
  * @generated
  */
  @Column(name = "attribute_03", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_03;

  /**
  * @generated
  */
  @Column(name = "attribute_04", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_04;

  /**
   * Construtor
   * @generated
   */
  public classdois(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public classdois setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém attribute_01
   * return attribute_01
   * @generated
   */
  
  public java.lang.String getAttribute_01(){
    return this.attribute_01;
  }

  /**
   * Define attribute_01
   * @param attribute_01 attribute_01
   * @generated
   */
  public classdois setAttribute_01(java.lang.String attribute_01){
    this.attribute_01 = attribute_01;
    return this;
  }

  /**
   * Obtém attribute_02
   * return attribute_02
   * @generated
   */
  
  public java.lang.String getAttribute_02(){
    return this.attribute_02;
  }

  /**
   * Define attribute_02
   * @param attribute_02 attribute_02
   * @generated
   */
  public classdois setAttribute_02(java.lang.String attribute_02){
    this.attribute_02 = attribute_02;
    return this;
  }

  /**
   * Obtém attribute_03
   * return attribute_03
   * @generated
   */
  
  public java.lang.String getAttribute_03(){
    return this.attribute_03;
  }

  /**
   * Define attribute_03
   * @param attribute_03 attribute_03
   * @generated
   */
  public classdois setAttribute_03(java.lang.String attribute_03){
    this.attribute_03 = attribute_03;
    return this;
  }

  /**
   * Obtém attribute_04
   * return attribute_04
   * @generated
   */
  
  public java.lang.String getAttribute_04(){
    return this.attribute_04;
  }

  /**
   * Define attribute_04
   * @param attribute_04 attribute_04
   * @generated
   */
  public classdois setAttribute_04(java.lang.String attribute_04){
    this.attribute_04 = attribute_04;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    classdois object = (classdois)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
