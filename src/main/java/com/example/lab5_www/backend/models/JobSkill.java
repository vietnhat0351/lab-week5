package com.example.lab5_www.backend.models;

import com.example.lab5_www.backend.enums.SkillLevel;
import com.example.lab5_www.backend.ids.JobSkillID;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "job_skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(JobSkillID.class)
public class JobSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @Column(name = "skill_level", nullable = false)
    private SkillLevel skillLevel;
    @Column(name = "more_infos", length = 1000)
    private String moreInfo;
}
