create table EmotionGraph_Dictionary (
	dictionaryId LONG not null primary key,
	name VARCHAR(75) null,
	language VARCHAR(75) null,
	description VARCHAR(75) null,
	contents BLOB,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table EmotionGraph_Job (
	jobId LONG not null primary key,
	name VARCHAR(75) null,
	dictionaryId LONG,
	status LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table EmotionGraph_JobDocument (
	jobDocumentId LONG not null primary key,
	jobId LONG,
	documentId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table EmotionGraph_JobDocumentResult (
	jobDocumentResultId LONG not null primary key,
	jobId LONG,
	documentId LONG,
	lineNo LONG,
	word VARCHAR(75) null,
	count LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);