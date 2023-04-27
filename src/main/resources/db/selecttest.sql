use adc;
    SELECT * FROM canvas;


INSERT INTO canvas (name, description, tags, constraints, dsa, complexity, code, test)
VALUES ('example_name1', 'example_description', 'tag1, tag2', 'example_constraint', 'example_dsa', 'example_complexity', 'example_code', 'example_test');


INSERT INTO canvas (name, description, tags, constraints, dsa, complexity, code, test)
VALUES ('example_name2', 'example_description', 'tag3, tag4', 'example_constraint', 'example_dsa', 'example_complexity', 'example_code', 'example_test');

UPDATE canvas SET name = '二叉树前序遍历', description = '遍历二叉树',
    tags = '二叉树', constraints = '10mins', dsa =  '队列',
    complexity = 'O(logN)', code = '', test =  '1， 2， 3' WHERE id =  5;

desc canvas;

ALTER TABLE canvas MODIFY tags VARCHAR(255);