package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Classify
 *
 * Full name:        System`Classify
 *
 *                   Classify[{example   class , example   class , …}] generates a ClassifierFunction[…] based on the examples and classes given.
 *                                    1        1         2        2
 *                   Classify[{example , example , …}  {class , class , …}] also generates a ClassifierFunction[…] based on the examples and classes given.
 *                                    1         2             1       2
 *                   Classify[ class   {example  , example  , …}, class   {example  , …}, … ] generates a ClassifierFunction[…] based on an association of classes with their examples.
 *                                   1           11         12           2           21
 *                   Classify[training, data] attempts to classify data using a classifier function deduced from the training set given.
 *                   Classify["name", data] attempts to classify data using the built-in classifier function represented by "name".
 *                   Classify[…, data, prop] gives the specified property of the classification associated with data.
 * Usage:            Classify[classifier, opts] takes an existing classifier function and modifies it with the new options given.
 *
 *                   AcceptanceThreshold -> Automatic
 *                   AnomalyDetector -> None
 *                   BatchProcessing -> Automatic
 *                   ClassPriors -> Automatic
 *                   DistributionPostProcessing -> Automatic
 *                   FeatureExtractor -> Identity
 *                   FeatureNames -> Automatic
 *                   FeatureTypes -> Automatic
 *                   FeatureWeights -> Automatic
 *                   ImputeMissingValues -> True
 *                   IndeterminateThreshold -> Automatic
 *                   Method -> Automatic
 *                   NominalVariables -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   PredictionName -> Automatic
 *                   ProcessorCaching -> True
 *                   RandomSeeding -> 1234
 *                   RecordLog -> True
 *                   TargetDevice -> CPU
 *                   TieBreakerFunction -> RandomChoice
 *                   TimeGoal -> Automatic
 *                   TrainingProgressCheckpointing -> None
 *                   TrainingProgressReporting -> Automatic
 *                   TrainingSizeRatio -> Automatic
 *                   UtilityFunction -> Automatic
 *                   ValidationSet -> Automatic
 * Options:          Weights -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Classify
 * Documentation:    web: http://reference.wolfram.com/language/ref/Classify.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun classify(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Classify", arguments.toMutableList(), options)
}
