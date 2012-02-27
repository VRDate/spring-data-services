package org.springframework.data.services.web.exporter.test;

import java.util.List;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Jon Brisbin <jon@jbrisbin.com>
 */
@Entity
public class Person {

  @Id private Long id;
  private String name;
  @OneToMany
  private List<Address> addresses;
  @OneToMany
  private Map<String, Profile> profiles;

  public Person() {
  }

  public Person(Long id, String name, List<Address> addresses, Map<String, Profile> profiles) {
    this.id = id;
    this.name = name;
    this.addresses = addresses;
    this.profiles = profiles;
  }

  public Person(String name, List<Address> addresses, Map<String, Profile> profiles) {
    this.name = name;
    this.addresses = addresses;
    this.profiles = profiles;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public Map<String, Profile> getProfiles() {
    return profiles;
  }

  public void setProfiles(Map<String, Profile> profiles) {
    this.profiles = profiles;
  }

}
