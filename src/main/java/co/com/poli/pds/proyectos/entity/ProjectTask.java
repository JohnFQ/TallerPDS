package co.com.poli.pds.proyectos.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter  
@Entity
@Table(name = "backlogs")
public class ProjectTask {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "sumary")
	private String sumary;
	
	@Column(name = "acceptanceCriteria")
	private String acceptanceCriteria;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "priority")
	private Integer priority;
	
	@Column(name = "hours")
	private Double hours;
	
	@Column(name = "startDate")
	private Date startDate;
	
	@Column(name = "endDate")
	private Date endDate;
	
	@Column(name = "projectIdentifier")
	private String projectIdentifier;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name=" backLog_id")
	private BackLog backLog;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectTask other = (ProjectTask) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
