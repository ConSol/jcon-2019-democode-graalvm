package de.consol.dus.graal.pojo;

import java.util.Date;
import java.util.Optional;

public class User {

  private static final String FMT = "User{name=%s, email=%s}";

  private String name;
  private String email;

  private Date creationDate;

  static User of(final String name, final String email) {
    return of(name, email, new Date());
  }

  static User of(final String name, final String email, final Date creationDate) {
    return new User(name, email, creationDate);
  }

  public User(final String name, final String email) {
    this(name, email, new Date());
  }

  private User(final String name, final String email, final Date creationDate) {
    this.name = Optional.of(name).orElseThrow(IllegalArgumentException::new);
    this.email = Optional.of(email).orElseThrow(IllegalArgumentException::new);
    this.creationDate = new Date(
            Optional.of(creationDate)
                    .orElseThrow(IllegalArgumentException::new)
                .getTime());
  }

  public String getName() {
    return name;
  }

  private void setName(final String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  private void setEmail(final String email) {
    this.email = email;
  }

  public Date getCreationDate() {
    return new Date(creationDate.getTime());
  }

  private void setCreationDate(final Date creationDate) {
    this.creationDate = new Date(creationDate.getTime());
  }

  @Override
  public String toString() {
    return String.format(FMT, this.getName(), this.getEmail());
  }
}
