library(plyr)

collapse <- function(frame) {
  newframe = data.frame(
    class = frame$class,
    method = frame$method,
    mr = frame$mr,
    AORB = (frame$AORB_killed / (frame$AORB_live + frame$AORB_killed)),
    AORS = (frame$AORS_killed / (frame$AORS_live + frame$AORS_killed)),
    AOIU = (frame$AOIU_killed / (frame$AOIU_live + frame$AOIU_killed)),
    AOIS = (frame$AOIS_killed / (frame$AOIS_live + frame$AOIS_killed)),
    AODU = (frame$AODU_killed / (frame$AODU_live + frame$AODU_killed)),
    AODU = (frame$AODU_killed / (frame$AODU_live + frame$AODU_killed)),
    AODS = (frame$AODS_killed / (frame$AODS_live + frame$AODS_killed)),
    ROR = (frame$ROR_killed / (frame$ROR_live + frame$ROR_killed)),
    COR = (frame$COR_killed / (frame$COR_live + frame$COR_killed)),
    COD = (frame$COD_killed / (frame$COD_live + frame$COD_killed)),
    COI = (frame$COI_killed / (frame$COI_live + frame$COI_killed)),
    SOR = (frame$SOR_killed / (frame$SOR_live + frame$SOR_killed)),
    LOR = (frame$LOR_killed / (frame$LOR_live + frame$LOR_killed)),
    LOI = (frame$LOI_killed / (frame$LOI_live + frame$LOI_killed)),
    LOD = (frame$LOD_killed / (frame$LOD_live + frame$LOD_killed)),
    ASRS = (frame$ASRS_killed / (frame$ASRS_live + frame$ASRS_killed)),
    SDL = (frame$SDL_killed / (frame$SDL_live + frame$SDL_killed)),
    VDL = (frame$VDL_killed / (frame$VDL_live + frame$VDL_killed)),
    CDL = (frame$CDL_killed / (frame$CDL_live + frame$CDL_killed)),
    ODL = (frame$ODL_killed / (frame$ODL_live + frame$ODL_killed)),
    total_live = frame$total_live,
    total_killed = frame$total_killed,
    total_score = frame$mutant_score
  )
  return(aggregate( newframe[, 4:26], list(newframe$class, newframe$method, newframe$mr), mean))
}

mr_breakout <- function(x) {
  newframe <- data.frame(
    Class = x$class,
    MR = x$mr,
    Arithmetic = x$AO_killed / (x$AO_killed + x$AO_live),
    Relational = x$RO_killed / (x$RO_killed + x$RO_live),
    Conditional = x$CO_killed / (x$CO_killed + x$CO_live),
    Shift = x$SO_killed / (x$SO_killed + x$SO_live),
    Logical = x$LO_killed / (x$LO_killed + x$LO_live),
    Assignment = x$AS_killed / (x$AS_killed + x$AS_live),
    Deletion = x$DL_killed / (x$DL_killed + x$DL_live)
  )
  return(newframe)
}


apache_agg = read.csv("MethodsFromApacheMath_aggregate.csv")
apache_add = read.csv("MethodsFromApacheMath_add.csv")
apache_mult = read.csv("MethodsFromApacheMath_mult.csv")
apache_perm = read.csv("MethodsFromApacheMath_perm.csv")
apache_inc = read.csv("MethodsFromApacheMath_inc.csv")
apache_inv = read.csv("MethodsFromApacheMath_inv.csv")
apache_exc = read.csv("MethodsFromApacheMath_exc.csv")


coll2_agg = read.csv("MethodCollection2_aggregate.csv")
coll2_add = read.csv("MethodCollection2_add.csv")
coll2_mult = read.csv("MethodCollection2_mult.csv")
coll2_perm = read.csv("MethodCollection2_perm.csv")
coll2_inc = read.csv("MethodCollection2_inc.csv")
coll2_inv = read.csv("MethodCollection2_inv.csv")
coll2_exc = read.csv("MethodCollection2_exc.csv")


colt_agg = read.csv("MethodsFromColt_aggregate.csv")
colt_add = read.csv("MethodsFromColt_add.csv")
colt_mult = read.csv("MethodsFromColt_mult.csv")
colt_perm = read.csv("MethodsFromColt_perm.csv")
colt_inc = read.csv("MethodsFromColt_inc.csv")
colt_inv = read.csv("MethodsFromColt_inv.csv")
colt_exc = read.csv("MethodsFromColt_exc.csv")


mahout_agg = read.csv("MethodsFromMahout_aggregate.csv")
mahout_add = read.csv("MethodsFromMahout_add.csv")
mahout_mult = read.csv("MethodsFromMahout_mult.csv")
mahout_perm = read.csv("MethodsFromMahout_perm.csv")
mahout_inc = read.csv("MethodsFromMahout_inc.csv")
mahout_inv = read.csv("MethodsFromMahout_inv.csv")
mahout_exc = read.csv("MethodsFromMahout_exc.csv")

sax_agg = data.frame(
  class = rep("SAXS", 3),
  mutant_score = c(1.0, 0.833, 0.914)
)

apache_combined = rbind(apache_agg, apache_add, apache_mult, apache_perm, apache_inc, apache_inv, apache_exc)
coll2_combined = rbind(coll2_agg, coll2_add, coll2_mult, coll2_perm, coll2_inc, coll2_inv, coll2_exc)
colt_combined = rbind(colt_agg, colt_add, colt_mult, colt_perm, colt_inc, colt_inv, colt_exc)
mahout_combined = rbind(mahout_agg, mahout_add, mahout_mult, mahout_perm, mahout_inc, mahout_inv, mahout_exc)

#agg_combined = rbind.fill(coll2_agg, colt_agg, apache_agg, sax_agg, mahout_agg)
#remove mahout
agg_combined = rbind.fill(coll2_agg, colt_agg, apache_agg, sax_agg)






#add_combined = rbind(coll2_add, colt_add, apache_add, mahout_add)
#mult_combined = rbind(coll2_mult, colt_mult, apache_mult, mahout_mult)
#perm_combined = rbind(coll2_perm, colt_perm, apache_perm, mahout_perm)
#exc_combined = rbind(coll2_exc, colt_exc, apache_exc, mahout_exc)
#inc_combined = rbind(coll2_inc, colt_inc, apache_inc, mahout_inc)
#inv_combined = rbind(coll2_inv, colt_inv, apache_inv, mahout_inv)
#remove mahout
add_combined = rbind(coll2_add, colt_add, apache_add)
mult_combined = rbind(coll2_mult, colt_mult, apache_mult)
perm_combined = rbind(coll2_perm, colt_perm, apache_perm)
exc_combined = rbind(coll2_exc, colt_exc, apache_exc)
inc_combined = rbind(coll2_inc, colt_inc, apache_inc)
inv_combined = rbind(coll2_inv, colt_inv, apache_inv)

MRs_combined = rbind(add_combined, mult_combined, perm_combined, exc_combined, inc_combined, inv_combined)

#boxplot(total_score ~ Group.1, data = agg_combined, ylab = "Fault Detection Score", main = "Aggregate MRs")
#boxplot(total_score ~ Group.3, data = MRs_combined, ylab = "Fault Detection Score", main = "Metamorphic Relations")
#boxplot(total_score ~ Group.1, data = MRs_combined, ylab = "Fault Detection Score", main = "Individual MRs - Overall")

#boxplot(total_score ~ Group.1, data = add_combined, ylab = "Fault Detection Score", main = "Individual MR: add", ylim=c(0,1.0))
#boxplot(total_score ~ Group.1, data = mult_combined, ylab = "Fault Detection Score", main = "Individual MR: mult", ylim=c(0,1.0))
#boxplot(total_score ~ Group.1, data = perm_combined, ylab = "Fault Detection Score", main = "Individual MR: perm", ylim=c(0,1.0))
#boxplot(total_score ~ Group.1, data = inc_combined, ylab = "Fault Detection Score", main = "Individual MR: inc", ylim=c(0,1.0))
#boxplot(total_score ~ Group.1, data = inv_combined, ylab = "Fault Detection Score", main = "Individual MR: inv", ylim=c(0,1.0))
#boxplot(total_score ~ Group.1, data = exc_combined, ylab = "Fault Detection Score", main = "Individual MR: exc", ylim=c(0,1.0))

#Aggregate MRs
#boxplot(mutant_score ~ class, data = agg_combined,ylab = "Fault Detection Score", ylim = c(-0.1, 1.1))

#Individual MRs - Overall
#rbind in the saxs data
saxs_mrs <- data.frame(
  class = rep("SAXS", 7),
  mr = c("inv", "inc", "mult", "exc", "inc", "exc", "perm"),
  mutant_score = c(0.789, 0.579, 0.895, 0.632, 0.815, 0.833, 0.914)
)
MRs_combined = rbind.fill(MRs_combined, saxs_mrs)
#boxplot(mutant_score ~ mr, data = MRs_combined, ylab = "Fault Detection Score", ylim = c(-0.1, 1.1))

#boxplot(mutant_score ~ mr, data = coll2_combined, ylab = "Fault Detection Score", main = "MethodCollection2", ylim = c(-0.1, 1.1))
#boxplot(mutant_score ~ mr, data = colt_combined, ylab = "Fault Detection Score", main = "MethodsFromColt", ylim = c(-0.1, 1.1))
#boxplot(mutant_score ~ mr, data = apache_combined, ylab = "Fault Detection Score", main = "MethodsFromApacheMath", ylim = c(-0.1, 1.1))
#boxplot(mutant_score ~ mr, data = mahout_combined, ylab = "Fault Detection Score", main = "MethodsFromMahout", ylim = c(-0.1, 1.1))

#boxplot( (MRs_combined$total_exceptions / (MRs_combined$total_live + MRs_combined$total_killed)) ~ MRs_combined$class, ylim = c(0,4), ylab = "Percentage of Mutants", main="Mutant Exception Rates")
#boxplot( (MRs_combined$total_timeouts / (MRs_combined$total_live + MRs_combined$total_killed)) ~ MRs_combined$class, ylim = c(0,2), ylab = "Percentage of Mutants", main="Mutant Time-out Rates")


#boxplot(mutant_score ~ mr, data = subset(MRs_combined, class != "MethodsFromMahout"), ylab = "Fault Detection Score", main = "Individual MRs - Overall (Without Mahout)", ylim = c(-0.1, 1.1))

mc2_mean <- mean(MRs_combined$mutant_score[MRs_combined$class=="MethodCollection2"], na.rm = TRUE)
apache_mean <- mean(MRs_combined$mutant_score[MRs_combined$class=="MethodsFromApacheMath"], na.rm = TRUE)
colt_mean <- mean(MRs_combined$mutant_score[MRs_combined$class=="MethodsFromColt"], na.rm = TRUE)
mahout_mean <- mean(MRs_combined$mutant_score[MRs_combined$class=="MethodsFromMahout"], na.rm = TRUE)
saxs_mean <- mean(MRs_combined$mutant_score[MRs_combined$class=="SAXS"], na.rm = TRUE)

types <- read.csv("TYPES.csv")
sax_types = data.frame(
  Class = rep("SAXS", 12),
  MutantType = c("arithmetic", "conditional", "logical", "assignment", "arithmetic", "conditional", "logical", "assignment", "arithmetic", "conditional", "logical", "assignment"),
  Score = c(1.0,
            1.0,
            1.0,
            1.0,
            0.816,
            1.0,
            1.0,
            1.0,
            0.9237,
            0.0,
            0.0,
            1.0)
)
types <- rbind.fill(types, sax_types)
#boxplot(types$Score ~ types$MutantType)

#################################################################################
#Turn these into barplot and get the different average versions



#new averages for MR types
m2_set = subset(types, Class == "MethodCollection2")
apache_set = subset(types, Class == "MethodsFromApacheMath")
colt_set = subset(types, Class == "MethodsFromColt")
mahout_set = subset(types, Class == "MethodsFromMahout")
sax_set = subset(types, Class == "SAXS")

m2_arithmetic = mean(subset(m2_set, MutantType == "arithmetic")$Score, na.rm = TRUE)
m2_assignment = mean(subset(m2_set, MutantType == "assignment")$Score, na.rm = TRUE)
m2_conditional = mean(subset(m2_set, MutantType == "conditional")$Score, na.rm = TRUE)
m2_deletion = mean(subset(m2_set, MutantType == "deletion")$Score, na.rm = TRUE)
m2_logical = mean(subset(m2_set, MutantType == "logical")$Score, na.rm = TRUE)
m2_relational = mean(subset(m2_set, MutantType == "relational")$Score, na.rm = TRUE)

apache_arithmetic = mean(subset(apache_set, MutantType == "arithmetic")$Score, na.rm = TRUE)
apache_assignment = mean(subset(apache_set, MutantType == "assignment")$Score, na.rm = TRUE)
apache_conditional = mean(subset(apache_set, MutantType == "conditional")$Score, na.rm = TRUE)
apache_deletion = mean(subset(apache_set, MutantType == "deletion")$Score, na.rm = TRUE)
apache_logical = mean(subset(apache_set, MutantType == "logical")$Score, na.rm = TRUE)
apache_relational = mean(subset(apache_set, MutantType == "relational")$Score, na.rm = TRUE)

colt_arithmetic = mean(subset(colt_set, MutantType == "arithmetic")$Score, na.rm = TRUE)
colt_assignment = mean(subset(colt_set, MutantType == "assignment")$Score, na.rm = TRUE)
colt_conditional = mean(subset(colt_set, MutantType == "conditional")$Score, na.rm = TRUE)
colt_deletion = mean(subset(colt_set, MutantType == "deletion")$Score, na.rm = TRUE)
colt_logical = mean(subset(colt_set, MutantType == "logical")$Score, na.rm = TRUE)
colt_relational = mean(subset(colt_set, MutantType == "relational")$Score, na.rm = TRUE)

mahout_arithmetic = mean(subset(mahout_set, MutantType == "arithmetic")$Score, na.rm = TRUE)
mahout_assignment = mean(subset(mahout_set, MutantType == "assignment")$Score, na.rm = TRUE)
mahout_conditional = mean(subset(mahout_set, MutantType == "conditional")$Score, na.rm = TRUE)
mahout_deletion = mean(subset(mahout_set, MutantType == "deletion")$Score, na.rm = TRUE)
mahout_logical = mean(subset(mahout_set, MutantType == "logical")$Score, na.rm = TRUE)
mahout_relational = mean(subset(mahout_set, MutantType == "relational")$Score, na.rm = TRUE)

sax_arithmetic = mean(subset(sax_set, MutantType == "arithmetic")$Score, na.rm = TRUE)
sax_assignment = mean(subset(sax_set, MutantType == "assignment")$Score, na.rm = TRUE)
sax_conditional = mean(subset(sax_set, MutantType == "conditional")$Score, na.rm = TRUE)
sax_deletion = mean(subset(sax_set, MutantType == "deletion")$Score, na.rm = TRUE)
sax_logical = mean(subset(sax_set, MutantType == "logical")$Score, na.rm = TRUE)
sax_relational = mean(subset(sax_set, MutantType == "relational")$Score, na.rm = TRUE)

arithmetic_means = c(sax_arithmetic, colt_arithmetic, apache_arithmetic, m2_arithmetic)
assignment_means = c(sax_assignment, colt_assignment, apache_assignment, m2_assignment)
conditional_means = c(sax_conditional, colt_conditional, apache_conditional, m2_conditional)
deletion_means = c(sax_deletion, colt_deletion, apache_deletion, m2_deletion)
logical_means = c(sax_logical, colt_logical, apache_logical, m2_logical)
relational_means = c(sax_relational, colt_relational, apache_relational, m2_relational)

type_means <- data.frame(
    Score = c(arithmetic_means, assignment_means, conditional_means, deletion_means, logical_means, relational_means),
    MutantType = c(rep("arithmetic", 4), rep("assignment", 4), rep("conditional", 4), rep("deletion", 4), rep("logical", 4), rep("relational", 4))
)

boxplot(type_means$Score ~ type_means$MutantType, ylab="Fault Detection Score")
barplot(c(
  mean(assignment_means, na.rm=TRUE),
  mean(deletion_means, na.rm=TRUE),
  mean(arithmetic_means, na.rm=TRUE),
  mean(relational_means, na.rm=TRUE),
  mean(logical_means, na.rm=TRUE),
  mean(conditional_means, na.rm=TRUE)
), ylab="Fault Detection Score", xpd=FALSE, ylim = c(0.75, 1.0), 
names.arg = c("assignment", "deletion", "arithmetic", "relational", "logical", "conditional"))

boxplot(mutant_score ~ class, data = agg_combined,ylab = "Fault Detection Score", ylim = c(0.4, 1.1))

#okay, agg mrs now
m2_agg_mean <- mean(subset(agg_combined, class == "MethodCollection2")$mutant_score, na.rm=TRUE)
apache_agg_mean <- mean(subset(agg_combined, class == "ApacheMath")$mutant_score, na.rm=TRUE)
mahout_agg_mean <- mean(subset(agg_combined, class == "Mahout")$mutant_score, na.rm=TRUE)
colt_agg_mean <- mean(subset(agg_combined, class == "Colt")$mutant_score, na.rm=TRUE)
sax_agg_mean <- mean(subset(agg_combined, class == "SAXS")$mutant_score, na.rm=TRUE)

barplot(c(colt_agg_mean, sax_agg_mean, apache_agg_mean, m2_agg_mean),
        names.arg = c("Colt", "SAX", "ApacheMath", "Collection2"),
        ylim=c(0.75,1), ylab="Fault Detection Score", xpd=FALSE)

#last thing - across individual mrs
boxplot(mutant_score ~ mr, data = MRs_combined, ylab = "Fault Detection Score", ylim = c(-0.1, 1.1))

#plot eath mutant type across libs
par(mfrow=c(2,3))
barplot(c(sax_assignment, m2_assignment, apache_assignment, colt_assignment),
        names.arg = c("SAX", "MC2", "Apache", "Colt"),
        ylim=c(0.5,1), main="Assignment Mutants", xpd=FALSE, ylab="Fault Detection Score")
barplot(c(sax_conditional, m2_conditional, apache_conditional, colt_conditional),
        names.arg = c("SAX", "MC2", "Apache", "Colt"),
        ylim=c(0.5,1), main="Conditional Mutants", xpd=FALSE, ylab="Fault Detection Score")
barplot(c(sax_deletion, m2_deletion, apache_deletion, colt_deletion),
        names.arg = c("SAX", "MC2", "Apache", "Colt"),
        ylim=c(0.5,1), main="Deletion Mutants", xpd=FALSE, ylab="Fault Detection Score")
barplot(c(sax_logical, m2_logical, apache_logical, colt_logical),
        names.arg = c("SAX", "MC2", "Apache", "Colt"),
        ylim=c(0.5,1), main="Logical Mutants", xpd=FALSE, ylab="Fault Detection Score")
barplot(c(sax_relational, m2_relational, apache_relational, colt_relational),
        names.arg = c("SAX", "MC2", "Apache", "Colt"),
        ylim=c(0.5,1), main="Relational Mutants", xpd=FALSE, ylab="Fault Detection Score")
barplot(c(sax_arithmetic, m2_arithmetic, apache_arithmetic, colt_arithmetic),
        names.arg = c("SAX", "MC2", "Apache", "Colt"),
        ylim=c(0.5,1), main="Arithmetic Mutants", xpd=FALSE, ylab="Fault Detection Score")
par(mfrow=c(1,1))

#and now each MR across libs
sax_add <- subset(saxs_mrs, mr == "add")
sax_mult <- subset(saxs_mrs, mr == "mult")
sax_perm <- subset(saxs_mrs, mr == "perm")
sax_inv <- subset(saxs_mrs, mr == "inv")
sax_exc <- subset(saxs_mrs, mr == "exc")
sax_inc <- subset(saxs_mrs, mr == "inc")

par(mfrow=c(2,3))
barplot(c(mean(coll2_add$mutant_score, na.rm=TRUE), mean(apache_add$mutant_score, na.rm=TRUE), mean(sax_add$mutant_score, na.rm=TRUE), mean(colt_add$mutant_score, na.rm=TRUE)),
    names.arg = c("MC2", "Apache", "SAX", "Colt"),
    main = "MR: add", ylab = "Fault Detection Score", ylim=c(0,1))
barplot(c(mean(coll2_mult$mutant_score, na.rm=TRUE), mean(apache_mult$mutant_score, na.rm=TRUE), mean(sax_mult$mutant_score, na.rm=TRUE), mean(colt_mult$mutant_score, na.rm=TRUE)),
    names.arg = c("MC2", "Apache", "SAX", "Colt"),
    main = "MR: mult", ylab = "Fault Detection Score", ylim=c(0,1))
barplot(c(mean(coll2_perm$mutant_score, na.rm=TRUE), mean(apache_perm$mutant_score, na.rm=TRUE), mean(sax_perm$mutant_score, na.rm=TRUE), mean(colt_perm$mutant_score, na.rm=TRUE)),
    names.arg = c("MC2", "Apache", "SAX", "Colt"),
    main = "MR: perm", ylab = "Fault Detection Score", ylim=c(0,1))
barplot(c(mean(coll2_inv$mutant_score, na.rm=TRUE), mean(apache_inv$mutant_score, na.rm=TRUE), mean(sax_inv$mutant_score, na.rm=TRUE), mean(colt_inv$mutant_score, na.rm=TRUE)),
    names.arg = c("MC2", "Apache", "SAX", "Colt"),
    main = "MR: inv", ylab = "Fault Detection Score", ylim=c(0,1))
barplot(c(mean(coll2_exc$mutant_score, na.rm=TRUE), mean(apache_exc$mutant_score, na.rm=TRUE), mean(sax_exc$mutant_score, na.rm=TRUE), mean(colt_exc$mutant_score, na.rm=TRUE)),
    names.arg = c("MC2", "Apache", "SAX", "Colt"),
    main = "MR: exc", ylab = "Fault Detection Score", ylim=c(0,1))
barplot(c(mean(coll2_inc$mutant_score, na.rm=TRUE), mean(apache_inc$mutant_score, na.rm=TRUE), mean(sax_inc$mutant_score, na.rm=TRUE), mean(colt_inc$mutant_score, na.rm=TRUE)),
    names.arg = c("MC2", "Apache", "SAX", "Colt"),
    main = "MR: inc", ylab = "Fault Detection Score", ylim=c(0,1))
par(mfrow=c(1,1))

par(mfrow=c(2,2))
barplot(
    c(mean(coll2_add$mutant_score,na.rm=TRUE),mean(coll2_mult$mutant_score,na.rm=TRUE),mean(coll2_perm$mutant_score,na.rm=TRUE),mean(coll2_inv$mutant_score,na.rm=TRUE),mean(coll2_inc$mutant_score,na.rm=TRUE),mean(coll2_exc$mutant_score,na.rm=TRUE)),
    names.arg = c("ADD", "MULT", "PERM", "INV", "INC", "EXC"),
    main = "MethodCollection2", ylab = "Fault Detection Score", ylim=c(0,1)
)
barplot(
    c(mean(apache_add$mutant_score,na.rm=TRUE),mean(apache_mult$mutant_score,na.rm=TRUE),mean(apache_perm$mutant_score,na.rm=TRUE),mean(apache_inv$mutant_score,na.rm=TRUE),mean(apache_inc$mutant_score,na.rm=TRUE),mean(apache_exc$mutant_score,na.rm=TRUE)),
    names.arg = c("ADD", "MULT", "PERM", "INV", "INC", "EXC"),
    main = "ApacheMath", ylab = "Fault Detection Score", ylim=c(0,1)
)
barplot(
    c(mean(sax_add$mutant_score,na.rm=TRUE),mean(sax_mult$mutant_score,na.rm=TRUE),mean(sax_perm$mutant_score,na.rm=TRUE),mean(sax_inv$mutant_score,na.rm=TRUE),mean(sax_inc$mutant_score,na.rm=TRUE),mean(sax_exc$mutant_score,na.rm=TRUE)),
    names.arg = c("ADD", "MULT", "PERM", "INV", "INC", "EXC"),
    main = "SAXS", ylab = "Fault Detection Score", ylim=c(0,1)
)
barplot(
    c(mean(colt_add$mutant_score,na.rm=TRUE),mean(colt_mult$mutant_score,na.rm=TRUE),mean(colt_perm$mutant_score,na.rm=TRUE),mean(colt_inv$mutant_score,na.rm=TRUE),mean(colt_inc$mutant_score,na.rm=TRUE),mean(colt_exc$mutant_score,na.rm=TRUE)),
    names.arg = c("ADD", "MULT", "PERM", "INV", "INC", "EXC"),
    main = "Colt", ylab = "Fault Detection Score", ylim=c(0,1)
)
par(mfrow=c(1,1))

s_arithmetic = subset(types, MutantType == "arithmetic")
s_assignment = subset(types, MutantType == "assignment")
s_conditional = subset(types, MutantType == "conditional")
s_deletion = subset(types, MutantType == "deletion")
s_logical = subset(types, MutantType == "logical")
s_relational = subset(types, MutantType == "relational")


add_arithmetic = mean(subset(s_arithmetic, MR == "add")$Score, na.rm = TRUE)
mult_arithmetic = mean(subset(s_arithmetic, MR == "mult")$Score, na.rm = TRUE)
perm_arithmetic = mean(subset(s_arithmetic, MR == "perm")$Score, na.rm = TRUE)
inv_arithmetic = mean(subset(s_arithmetic, MR == "inv")$Score, na.rm = TRUE)
exc_arithmetic = mean(subset(s_arithmetic, MR == "exc")$Score, na.rm = TRUE)
inc_arithmetic = mean(subset(s_arithmetic, MR == "inc")$Score, na.rm = TRUE)

add_assignment = mean(subset(s_assignment, MR == "add")$Score, na.rm = TRUE)
mult_assignment = mean(subset(s_assignment, MR == "mult")$Score, na.rm = TRUE)
perm_assignment = mean(subset(s_assignment, MR == "perm")$Score, na.rm = TRUE)
inv_assignment = mean(subset(s_assignment, MR == "inv")$Score, na.rm = TRUE)
exc_assignment = mean(subset(s_assignment, MR == "exc")$Score, na.rm = TRUE)
inc_assignment = mean(subset(s_assignment, MR == "inc")$Score, na.rm = TRUE)

add_conditional = mean(subset(s_conditional, MR == "add")$Score, na.rm = TRUE)
mult_conditional = mean(subset(s_conditional, MR == "mult")$Score, na.rm = TRUE)
perm_conditional = mean(subset(s_conditional, MR == "perm")$Score, na.rm = TRUE)
inv_conditional = mean(subset(s_conditional, MR == "inv")$Score, na.rm = TRUE)
exc_conditional = mean(subset(s_conditional, MR == "exc")$Score, na.rm = TRUE)
inc_conditional = mean(subset(s_conditional, MR == "inc")$Score, na.rm = TRUE)

add_deletion = mean(subset(s_deletion, MR == "add")$Score, na.rm = TRUE)
mult_deletion = mean(subset(s_deletion, MR == "mult")$Score, na.rm = TRUE)
perm_deletion = mean(subset(s_deletion, MR == "perm")$Score, na.rm = TRUE)
inv_deletion = mean(subset(s_deletion, MR == "inv")$Score, na.rm = TRUE)
exc_deletion = mean(subset(s_deletion, MR == "exc")$Score, na.rm = TRUE)
inc_deletion = mean(subset(s_deletion, MR == "inc")$Score, na.rm = TRUE)

add_logical = mean(subset(s_logical, MR == "add")$Score, na.rm = TRUE)
mult_logical = mean(subset(s_logical, MR == "mult")$Score, na.rm = TRUE)
perm_logical = mean(subset(s_logical, MR == "perm")$Score, na.rm = TRUE)
inv_logical = mean(subset(s_logical, MR == "inv")$Score, na.rm = TRUE)
exc_logical = mean(subset(s_logical, MR == "exc")$Score, na.rm = TRUE)
inc_logical = mean(subset(s_logical, MR == "inc")$Score, na.rm = TRUE)

add_relational = mean(subset(s_relational, MR == "add")$Score, na.rm = TRUE)
mult_relational = mean(subset(s_relational, MR == "mult")$Score, na.rm = TRUE)
perm_relational = mean(subset(s_relational, MR == "perm")$Score, na.rm = TRUE)
inv_relational = mean(subset(s_relational, MR == "inv")$Score, na.rm = TRUE)
exc_relational = mean(subset(s_relational, MR == "exc")$Score, na.rm = TRUE)
inc_relational = mean(subset(s_relational, MR == "inc")$Score, na.rm = TRUE)

par(mfrow=c(2,3))
barplot(c(add_assignment, mult_assignment, perm_assignment, inv_assignment, exc_assignment, inc_assignment),
        names.arg = c("ADD", "MULT", "PERM", "INV", "EXC", "INC"),
        ylim=c(0.4,1), main="Assignment Mutants", xpd=FALSE, ylab="Fault Detection Score")
barplot(c(add_conditional, mult_conditional, perm_conditional, inv_conditional, exc_conditional, inc_conditional),
        names.arg = c("ADD", "MULT", "PERM", "INV", "EXC", "INC"),
        ylim=c(0.4,1), main="Conditional Mutants", xpd=FALSE, ylab="Fault Detection Score")
barplot(c(add_deletion, mult_deletion, perm_deletion, inv_deletion, exc_deletion, inc_deletion),
        names.arg = c("ADD", "MULT", "PERM", "INV", "EXC", "INC"),
        ylim=c(0.4,1), main="Deletion Mutants", xpd=FALSE, ylab="Fault Detection Score")
barplot(c(add_logical, mult_logical, perm_logical, inv_logical, exc_logical, inc_logical),
        names.arg = c("ADD", "MULT", "PERM", "INV", "EXC", "INC"),
        ylim=c(0.4,1), main="Logical Mutants", xpd=FALSE, ylab="Fault Detection Score")
barplot(c(add_relational, mult_relational, perm_relational, inv_relational, exc_relational, inc_relational),
        names.arg = c("ADD", "MULT", "PERM", "INV", "EXC", "INC"),
        ylim=c(0.4,1), main="Relational Mutants", xpd=FALSE, ylab="Fault Detection Score")
barplot(c(add_arithmetic, mult_arithmetic, perm_arithmetic, inv_arithmetic, exc_arithmetic, inc_arithmetic),
        names.arg = c("ADD", "MULT", "PERM", "INV", "EXC", "INC"),
        ylim=c(0.4,1), main="Arithmetic Mutants", xpd=FALSE, ylab="Fault Detection Score")
par(mfrow=c(1,1))

par(mfrow=c(2,3))
barplot(c(add_assignment, add_conditional, add_deletion, add_logical, add_relational, add_arithmetic),
        names.arg = c("Assignment", "Conditional", "Deletion", "Logical", "Relational", "Arithmetic"),
        ylim=c(0.4,1), main="MR: add", xpd=FALSE, ylab="Fault Detection Score")
barplot(c(mult_assignment, mult_conditional, mult_deletion, mult_logical, mult_relational, mult_arithmetic),
        names.arg = c("Assignment", "Conditional", "Deletion", "Logical", "Relational", "Arithmetic"),
        ylim=c(0.4,1), main="MR: mult", xpd=FALSE, ylab="Fault Detection Score")
barplot(c(perm_assignment, perm_conditional, perm_deletion, perm_logical, perm_relational, perm_arithmetic),
        names.arg = c("Assignment", "Conditional", "Deletion", "Logical", "Relational", "Arithmetic"),
        ylim=c(0.4,1), main="MR: perm", xpd=FALSE, ylab="Fault Detection Score")
barplot(c(inv_assignment, inv_conditional, inv_deletion, inv_logical, inv_relational, inv_arithmetic),
        names.arg = c("Assignment", "Conditional", "Deletion", "Logical", "Relational", "Arithmetic"),
        ylim=c(0.4,1), main="MR: inv", xpd=FALSE, ylab="Fault Detection Score")
barplot(c(inc_assignment, inc_conditional, inc_deletion, inc_logical, inc_relational, inc_arithmetic),
        names.arg = c("Assignment", "Conditional", "Deletion", "Logical", "Relational", "Arithmetic"),
        ylim=c(0.4,1), main="MR: inc", xpd=FALSE, ylab="Fault Detection Score")
barplot(c(exc_assignment, exc_conditional, exc_deletion, exc_logical, exc_relational, exc_arithmetic),
        names.arg = c("Assignment", "Conditional", "Deletion", "Logical", "Relational", "Arithmetic"),
        ylim=c(0.4,1), main="MR: exc", xpd=FALSE, ylab="Fault Detection Score")
par(mfrow=c(1,1))

colt_add_and_mult = read.csv("MethodsFromColt_add_and_mult.csv")
coll2_add_and_mult = read.csv("MethodCollection2_add_and_mult.csv")
apache_add_and_mult = read.csv("MethodsFromApacheMath_add_and_mult.csv")

colt_add_mult_inc = read.csv("MethodsFromColt_add_mult_inc.csv")
coll2_add_mult_inc = read.csv("MethodCollection2_add_mult_inc.csv")
apache_add_mult_inc = read.csv("MethodsFromApacheMath_add_mult_inc.csv")

colt_add_mult_inc_perm = read.csv("MethodsFromColt_add_mult_inc_perm.csv")
coll2_add_mult_inc_perm = read.csv("MethodCollection2_add_mult_inc_perm.csv")
apache_add_mult_inc_perm = read.csv("MethodsFromApacheMath_add_mult_inc_perm.csv")


colt_add_mult_inc_perm_exc = read.csv("MethodsFromColt_add_mult_inc_perm_exc.csv")
coll2_add_mult_inc_perm_exc = read.csv("MethodCollection2_add_mult_inc_perm_exc.csv")
apache_add_mult_inc_perm_exc = read.csv("MethodsFromApacheMath_add_mult_inc_perm_exc.csv")

colt_all = read.csv("MethodsFromColt_all.csv")
coll2_all = read.csv("MethodCollection2_all.csv")
apache_all = read.csv("MethodsFromApacheMath_all.csv")

add_and_mult_all = rbind.fill(colt_add_and_mult, coll2_add_and_mult, apache_add_and_mult, sax_mult)
add_mult_inc_all = c(colt_add_mult_inc$mutant_score, coll2_add_mult_inc$mutant_score, apache_add_mult_inc$mutant_score, 0.94, 0.81, 0.0)
add_mult_inc_perm_all = c(colt_add_mult_inc_perm$mutant_score, coll2_add_mult_inc_perm$mutant_score, apache_add_mult_inc_perm$mutant_score, 0.94, 0.81, 0.91)
add_mult_inc_perm_exc_all = c(colt_add_mult_inc_perm_exc$mutant_score, coll2_add_mult_inc_perm_exc$mutant_score, apache_add_mult_inc_perm_exc$mutant_score, 0.94, 0.81, 0.91)
all_all = c(colt_all$mutant_score, coll2_all$mutant_score, apache_all$mutant_score, 1.0, 0.81, 0.91)

add_and_mult_combined = mean(c(
  mean(replace(colt_add_and_mult$mutant_score, is.na(colt_add_and_mult$mutant_score), 0), na.rm=TRUE),
  mean(replace(coll2_add_and_mult$mutant_score, is.na(coll2_add_and_mult$mutant_score), 0), na.rm=TRUE),
  mean(replace(apache_add_and_mult$mutant_score, is.na(apache_add_and_mult$mutant_score), 0), na.rm=TRUE),
  mean(replace(sax_mult$mutant_score, na.rm=TRUE)
))
add_mult_inc_combined = mean(c(
  mean(replace(colt_add_mult_inc$mutant_score, is.na(colt_add_mult_inc$mutant_score), 0), na.rm=TRUE),
  mean(replace(coll2_add_mult_inc$mutant_score, is.na(coll2_add_mult_inc$mutant_score), 0), na.rm=TRUE),
  mean(replace(apache_add_mult_inc$mutant_score, is.na(apache_add_mult_inc$mutant_score), 0), na.rm=TRUE),
  mean(0.94, 0.81, 0.0)
))
add_mult_inc_perm_combined = mean(c(
  mean(replace(colt_add_mult_inc_perm$mutant_score, is.na(colt_add_mult_inc_perm$mutant_score), 0), na.rm=TRUE),
  mean(replace(coll2_add_mult_inc_perm$mutant_score, is.na(coll2_add_mult_inc_perm$mutant_score), 0), na.rm=TRUE),
  mean(replace(apache_add_mult_inc_perm$mutant_score, is.na(apache_add_mult_inc_perm$mutant_score), 0), na.rm=TRUE),
  mean(0.94,0.81,0.91)
))
add_mult_inc_perm_exc_combined = mean(c(
  mean(replace(colt_add_mult_inc_perm_exc$mutant_score, is.na(colt_add_mult_inc_perm_exc$mutant_score), 0), na.rm=TRUE),
  mean(replace(coll2_add_mult_inc_perm_exc$mutant_score, is.na(coll2_add_mult_inc_perm_exc$mutant_score), 0), na.rm=TRUE),
  mean(replace(apache_add_mult_inc_perm_exc$mutant_score, is.na(apache_add_mult_inc_perm_exc$mutant_score), 0), na.rm=TRUE),
  mean(0.94,0.83,0.91)
))
all_combined = mean(c(
  mean(colt_all$mutant_score, na.rm=TRUE),
  mean(coll2_all$mutant_score, na.rm=TRUE),
  mean(apache_all$mutant_score, na.rm=TRUE),
  mean(1.0,0.83,0.91)
))

barplot(
  c(
    mean(agg_combined$mutant_score, na.rm=TRUE),
    add_and_mult_combined,
    mean(add_combined$mutant_score, na.rm=TRUE),
    mean(mult_combined$mutant_score, na.rm=TRUE)
  ),
  names.arg = c("Aggregate", "ADD & MULT", "ADD", "MULT"),
  ylab = "Fault Detection Score",
  ylim = c(0.8,1.0),
  xpd=FALSE
)

barplot(
  c(
    mean(add_combined$mutant_score, na.rm=TRUE),
    add_and_mult_combined,
    add_mult_inc_combined,
    add_mult_inc_perm_combined,
    add_mult_inc_perm_exc_combined,
    mean(agg_combined$mutant_score, na.rm=TRUE)
  ),
  names.arg = c(
    "add",
    "add\nmult",
    "add\nmult\ninc",
    "add\nmult\ninc\nperm",
    "add\nmult\ninc\nperm\nexc",
    "all"
  ),
  ylim = c(0.85,0.95), xpd=FALSE
)

%It's looking valid, folks
barplot(
  c(
    mean(add_combined$mutant_score, na.rm=TRUE),
    add_and_mult_combined,
    mean(add_mult_inc_all, na.rm=TRUE),
    mean(add_mult_inc_perm_all, na.rm=TRUE),
    mean(add_mult_inc_perm_exc_all, na.rm=TRUE),
    mean(agg_combined$mutant_score, na.rm=TRUE)
  ),
  names.arg = c(
    "add",
    "add\nmult",
    "add\nmult\ninc",
    "add\nmult\ninc\nperm",
    "add\nmult\ninc\nperm\nexc",
    "all"
  ),
  ylim = c(0.85,0.95), xpd=FALSE
)

mean(c(
  mean(apache_agg$mutant_score, na.rm=TRUE),
  mean(coll2_agg$mutant_score, na.rm=TRUE), 
  mean(apache_agg$mutant_score, na.rm=TRUE), 
  mean(sax_agg$mutant_score, na.rm=TRUE)
))
mean(agg_combined$mutant_score, na.rm=TRUE)
mean(add_and_mult_all$mutant_score, na.rm=TRUE)

add_mean <- mean(add_combined$mutant_score, na.rm=TRUE)
mult_mean <- mean(mult_combined$mutant_score, na.rm=TRUE)
perm_mean <- mean(perm_combined$mutant_score, na.rm=TRUE)
inv_mean <- mean(inv_combined$mutant_score, na.rm=TRUE)
inc_mean <- mean(inc_combined$mutant_score, na.rm=TRUE)
exc_mean <- mean(exc_combined$mutant_score, na.rm=TRUE)

barplot(c(add_mean, mult_mean, inc_mean, perm_mean, exc_mean, inv_mean), ylim=c(0.4,0.9), xpd=FALSE,
        names.arg=c("ADD", "MULT", "INC", "PERM", "EXC", "INV"),
        ylab="Fault Detection Score")
